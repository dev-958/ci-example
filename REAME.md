Simple multi-module micro-service example
=========================================

Key features:
-------------

* Major version controlled in one place in master pom

* Individual submodules can be advanced and pushed by local tags for snapshots i.e. *87daa93-SNAPSHOT*

* Allows the building of snapshot and release artifacts without the releases plugin or automated commits

* Builds executable jars and tagged images

* Writes artifacts to nexus

* Easy to use

Usage
-----

    mvn -pl sub-module1 install
     
Builds module sub-module1 as a SNAPSHOT, docker artifact will be tagged according to values in values.yaml in module root

    mvn -pl sub-module1 clean install -P pi
    
As above but values.yaml will be regenerated using the latest git hash and the docker artifact tagged with that value. The 
**pi** profile stands for "push image", helm will see the new tag as a change and deploy the new version into your local kubernetes 
cluster

> #####Deployment builds would only run on the CI/CD pipeline:
>       mvn deploy
> Build and deploy SNAPSHOT artifacts to nexus, helm will only deploy re-tagged containers 
>       
>       mvn deploy -Drevision=RELEASE -P pi
> Build and deploy RELEASE artifacts to nexus, all images will be re-tagged to the latest git hash and helm will
> deploy all containers
>
>       docker image ls --filter label=project=ci-example
>       
>       REPOSITORY               TAG                 IMAGE ID            CREATED             SIZE                       
>       ci-example/sub-module1   52e0374-SNAPSHOT    103edb5a2d94        8 seconds ago       612MB
>       ci-example/sub-module1   52e0374-RELEASE     9a5a5738efe6        2 minutes ago       612MB
>       ci-example/sub-module1   87daa93-RELEASE     349d8572ecf4        9 minutes ago       612MB
>       ci-example/sub-module1   87daa93-SNAPSHOT    470ebea064fc        12 minutes ago      612MB
>       ci-example/sub-module1   feab90c-RELEASE     da307deed6fd        About an hour ago   612MB
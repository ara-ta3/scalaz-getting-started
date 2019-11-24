SBT=sbt/bin/sbt

console:
	$(SBT) console

console/test:
	$(SBT) test:console

run:
	$(SBT) run

compile:
	$(SBT) compile



$command=$args[0]
$mvar=$args[1]

if($command -eq 'run') {
  mvn spring-boot:run
  return
}

if($command -eq 'dir') {
  mkdir src/main/java/com/diduy/application/$mvar
  return
}

vi src/main/java/com/diduy/application/$command

echo "failed"


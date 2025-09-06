# RL Arcade

## Project Structure

```
rl_arcade/
├── app/                              
│   ├── build.gradle                  
│   └── src/
│       └── main/
│           └── java/
│               └── rl_arcade/
│                   ├── App.java      
│                   ├── config/  
│                   │   └── Config.java
│                   ├── games/        
│                   │   └── car_obstacle/
│                   │       ├── Car.java
│                   │       ├── GameEngine.java
│                   │       ├── GamePanel.java
│                   │       └── Obstacle.java
│                   └── proto/        
├── model/                            
│   ├── main.py                       
│   ├── agent/                        
│   │   ├── __init__.py
│   │   ├── base_agent.py
│   │   ├── dqn_agent.py
│   │   └── ppo_agent.py
│   ├── client/                       
│   │   ├── __init__.py
│   │   └── client.py
│   ├── config/                       
│   │   ├── __init__.py
│   │   └── config.py
│   └── proto/                        
├── data/                            
│   └── output_model/                                   
├── proto/                           
│   └── gameai.proto                  
├── gradle/                          
│   ├── libs.versions.toml            
│   └── wrapper/                      
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── settings.gradle                   
├── gradlew                           
├── gradlew.bat                       
├── LICENSE                           
└── README.md                         
```

## To create new gRPC files, run:
```
./gradlew clean generateProto copyGeneratedProtos
```

## To build Car Obstacle Game, run:
```
./gradlew wrapper --gradle-version 8.8
./gradlew --stop
rm -rf ~/.gradle/caches/
./gradlew build
```

## To run Car Obstacle Game, run:
```
./gradlew run
```
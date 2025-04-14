# [insurtrain]

[![Thesis PDF](https://img.shields.io/badge/Thesis-PDF-blue)](https://github.com/roccogold/insurtrain_thesis/blob/main/master_thesis_project.pdf)

A decentralized insurance solution leveraging Business Process Modeling (BPMN) and smart contracts to automate claims processing for train delays through blockchain technology.

## Abstract 📄
This project demonstrates a methodology for designing smart contracts using BPMN 2.0 choreography to enable transparent collaboration between mutually untrusted parties[^1]. The implementation focuses on parametric insurance that automatically compensates passengers when train delays exceed 10 minutes, using real-world data from railway APIs via oracle networks[^2].

[^1]: Goldschmidt, R. (2022). Methodology for Designing Smart Contracts Using BPMN Choreography. University of Bologna.
[^2]: Integrated with Chainlink oracle network for real-time data verification

## Key Features 🔑
- **Automated Claims Processing**: Compensation triggered within minutes of delay verification
- **BPMN-Based Smart Contracts**: Visual workflow modeling using BPMN
- **Blockchain Transparency**: Immutable transaction records on private blockchain
- **Parametric Insurance Model**: 
  - premium calculation based on travel distance (5-7% of ticket price)
  - Compensation tiers (50-100% of ticket value)
- **Oracle Integration**: Real-time train status verification through API connections

## Workflow Overview 🔄
### Multi-Party Choreography (Orchestica)
![Main Workflow](https://user-images.githubusercontent.com/95515159/182446946-98669048-1d7f-42f3-a438-6a600cc3c2cf.png)
*Collaborative process between client, insurer, and railway data providers*

### Client-Side Process (Harp Client)
![Client Flow](https://user-images.githubusercontent.com/95515159/182563344-d1284e73-4539-48d9-9071-a1c374bc824d.png)
*Policy application and compensation workflow for end-users*

### Insurance Operations (Harp Insurance)
![Insurance Flow](https://user-images.githubusercontent.com/95515159/182563363-713fd565-b682-4d5f-b70a-bb372e20573c.png)
*Automated underwriting and claims processing system*

## Technical Implementation ⚙️
**Core Components**:
- **BPMN 2.0** for process modeling
- **Camunda Platform** for workflow automation
- **Solidity** smart contract templates
- **Chainlink Oracles** for train data verification
- **Bitcoin Testnet** for payment simulations


## Authors 👥
**Rocco Goldschmidt**, API Product Manager
[📧](mailto:roccogold23@gmail.com) | [💼](https://www.linkedin.com/in/roccogoldschmidt/) 

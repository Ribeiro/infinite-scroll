
**Considerações**:

* O uso de Keyset Pagination é mais eficiente do que a paginação baseada em offsets, pois evita a sobrecarga de pular muitas linhas em bancos de dados grandes.

* O WindowIterator pode ser mais performático em grandes volumes de dados, pois evita a sobrecarga de grandes saltos com OFFSET e utiliza um cursor eficiente baseado em uma chave.

* Você pode adaptar o tamanho da página e a lógica de chave (cursor) conforme a necessidade.

* Isso proporciona uma experiência de rolagem infinita suave e escalável.


**Front-end**:

* Na pasta src/main/resources/front-end há um exemplo no arquivo infinite-scroll.js de como fazer as chamadas à API.

<form action="/clientes" type="post">
	<p>
		<label>CPF:</label>
		<input type="text" name="cpf" required="required" />
	</p>
	
	<br/>
	<p>
		<label>Nome:</label>
		<input type="text" name="nome" required="required" />
	</p>
	
	<br/>
	<p>
		<label>Email:</label>
		<input type="email" name="email" required="required" />
	</p>

	<br/>
	<p>
		<label>Data de nascimento:</label>
		<input type="date" name="dataNascimento" required="required" />
	</p>

	<br/>
	<p>
		<label>Sexo:</label>
		<input type="radio" name="sexo" value="masculino" checked>Masculino<br>
			<input type="radio" name="sexo" value="feminino">Feminino 
	</p>

	<br/>
	<p>
		<label>Estado civil:</label>
		<select name="estadoCivil">
			<option value="solteiro">Solteiro</option>
			<option value="casado">Casado</option>
			<option value="separado">Separado</option>
			<option value="divorciado">Divorciado</option>
			<option value="viuvo">Viúvo</option>
		</select>
	</p>

	<br/>
	<p>
		<label>Ativo:</label>
		<input type="checkbox" name="ativo" value="sim">Sim<br>
 			<input type="checkbox" name="ativo" value="nao">Não
	</p>

	<br/>
	<input type="submit" value="Cadastrar">
</form>
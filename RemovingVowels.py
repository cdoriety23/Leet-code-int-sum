import re

string_a = "chrassguuioousssussaaaiieeuuuwwwwuuww"
string_b = "aeiou"
string_c = "leetcodeisacommuintyforcoders"

x= re.sub("[aeiou]", "", string_a)
print(x)

y = re.sub("[aeiou]", "", string_b)
print(y)

z = re.sub("[aeiou]", "", string_c)
print(z)

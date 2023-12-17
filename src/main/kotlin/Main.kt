fun main(args: Array<String>) {
    var a:String;
    var b:String;
    print("Input first array: "); a = readln();
    print("Input second array: "); b = readln();
    println("Filtered: " + filter(a, b))
}

fun filter(a:String, b:String): String
{
    var mx = a;
    var mn = b;
    var max = 0;
    if (b.length > a.length) { mx = b; mn = a;}
    var filter = "";
    for (i in mx)
    {
        for (j in mn)
        {
            if ((i == j) && (j.toInt() >= max))
            {
                filter += j;
                max = j.toInt();
            }
        }
    }
    return filter;
}
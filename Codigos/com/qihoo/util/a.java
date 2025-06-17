package com.qihoo.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a
{
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    paramString = paramString.toCharArray();
    int i = 0;
    while (i < paramString.length)
    {
      paramString[i] = ((char)(paramString[i] ^ 0x10));
      i += 1;
    }
    return String.valueOf(paramString);
  }
  
  private static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  /* Error */
  public static boolean a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: getstatic 47	android/os/Build:SUPPORTED_32_BIT_ABIS	[Ljava/lang/String;
    //   6: astore_3
    //   7: aload_3
    //   8: arraylength
    //   9: istore_1
    //   10: iconst_0
    //   11: istore_0
    //   12: iload_0
    //   13: iload_1
    //   14: if_icmpge +16 -> 30
    //   17: aload_3
    //   18: iload_0
    //   19: aaload
    //   20: ldc 49
    //   22: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   25: ifeq +506 -> 531
    //   28: iconst_1
    //   29: ireturn
    //   30: getstatic 56	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   33: ldc 49
    //   35: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   38: ifne +491 -> 529
    //   41: getstatic 59	android/os/Build:CPU_ABI2	Ljava/lang/String;
    //   44: ldc 49
    //   46: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   49: istore_2
    //   50: iload_2
    //   51: ifne +478 -> 529
    //   54: new 61	java/io/RandomAccessFile
    //   57: dup
    //   58: ldc 63
    //   60: ldc 65
    //   62: invokespecial 69	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: astore_3
    //   66: aload_3
    //   67: invokevirtual 73	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   70: astore 4
    //   72: aload 4
    //   74: ifnull +43 -> 117
    //   77: aload 4
    //   79: ldc 75
    //   81: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   84: ifeq +24 -> 108
    //   87: aload 4
    //   89: ldc 49
    //   91: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   94: istore_2
    //   95: iload_2
    //   96: ifeq +12 -> 108
    //   99: aload_3
    //   100: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   103: iconst_1
    //   104: ireturn
    //   105: astore_3
    //   106: iconst_1
    //   107: ireturn
    //   108: aload_3
    //   109: invokevirtual 73	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   112: astore 4
    //   114: goto -42 -> 72
    //   117: aload_3
    //   118: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   121: new 78	java/io/FileInputStream
    //   124: dup
    //   125: ldc 80
    //   127: invokespecial 83	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   130: astore_3
    //   131: bipush 20
    //   133: newarray <illegal type>
    //   135: astore 4
    //   137: aload_3
    //   138: aload 4
    //   140: invokevirtual 87	java/io/FileInputStream:read	([B)I
    //   143: bipush 20
    //   145: if_icmpne +273 -> 418
    //   148: aload 4
    //   150: iconst_0
    //   151: baload
    //   152: bipush 127
    //   154: if_icmpne +264 -> 418
    //   157: aload 4
    //   159: iconst_1
    //   160: baload
    //   161: bipush 69
    //   163: if_icmpne +255 -> 418
    //   166: aload 4
    //   168: iconst_2
    //   169: baload
    //   170: bipush 76
    //   172: if_icmpne +246 -> 418
    //   175: aload 4
    //   177: iconst_3
    //   178: baload
    //   179: bipush 70
    //   181: if_icmpne +237 -> 418
    //   184: aload 4
    //   186: bipush 18
    //   188: baload
    //   189: iconst_3
    //   190: if_icmpeq +15 -> 205
    //   193: aload 4
    //   195: bipush 18
    //   197: baload
    //   198: istore_0
    //   199: iload_0
    //   200: bipush 62
    //   202: if_icmpne +216 -> 418
    //   205: aload_3
    //   206: ifnull +323 -> 529
    //   209: aload_3
    //   210: invokevirtual 88	java/io/FileInputStream:close	()V
    //   213: iconst_1
    //   214: ireturn
    //   215: astore_3
    //   216: iconst_1
    //   217: ireturn
    //   218: astore_3
    //   219: aconst_null
    //   220: astore_3
    //   221: aload_3
    //   222: ifnull -101 -> 121
    //   225: aload_3
    //   226: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   229: goto -108 -> 121
    //   232: astore_3
    //   233: goto -112 -> 121
    //   236: astore_3
    //   237: aconst_null
    //   238: astore_3
    //   239: aload_3
    //   240: ifnull -119 -> 121
    //   243: aload_3
    //   244: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   247: goto -126 -> 121
    //   250: astore_3
    //   251: goto -130 -> 121
    //   254: astore_3
    //   255: aconst_null
    //   256: astore 4
    //   258: aload 4
    //   260: ifnull +8 -> 268
    //   263: aload 4
    //   265: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   268: aload_3
    //   269: athrow
    //   270: astore_3
    //   271: getstatic 56	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   274: ldc 49
    //   276: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   279: ifne +250 -> 529
    //   282: getstatic 59	android/os/Build:CPU_ABI2	Ljava/lang/String;
    //   285: ldc 49
    //   287: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   290: ifne +239 -> 529
    //   293: new 61	java/io/RandomAccessFile
    //   296: dup
    //   297: ldc 63
    //   299: ldc 65
    //   301: invokespecial 69	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   304: astore_3
    //   305: aload_3
    //   306: invokevirtual 73	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   309: astore 4
    //   311: aload 4
    //   313: ifnull +43 -> 356
    //   316: aload 4
    //   318: ldc 75
    //   320: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   323: ifeq +24 -> 347
    //   326: aload 4
    //   328: ldc 49
    //   330: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   333: istore_2
    //   334: iload_2
    //   335: ifeq +12 -> 347
    //   338: aload_3
    //   339: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   342: iconst_1
    //   343: ireturn
    //   344: astore_3
    //   345: iconst_1
    //   346: ireturn
    //   347: aload_3
    //   348: invokevirtual 73	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   351: astore 4
    //   353: goto -42 -> 311
    //   356: aload_3
    //   357: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   360: goto -239 -> 121
    //   363: astore_3
    //   364: goto -243 -> 121
    //   367: astore_3
    //   368: aconst_null
    //   369: astore_3
    //   370: aload_3
    //   371: ifnull -250 -> 121
    //   374: aload_3
    //   375: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   378: goto -257 -> 121
    //   381: astore_3
    //   382: goto -261 -> 121
    //   385: astore_3
    //   386: aconst_null
    //   387: astore_3
    //   388: aload_3
    //   389: ifnull -268 -> 121
    //   392: aload_3
    //   393: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   396: goto -275 -> 121
    //   399: astore_3
    //   400: goto -279 -> 121
    //   403: astore 4
    //   405: aconst_null
    //   406: astore_3
    //   407: aload_3
    //   408: ifnull +7 -> 415
    //   411: aload_3
    //   412: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   415: aload 4
    //   417: athrow
    //   418: aload_3
    //   419: ifnull +7 -> 426
    //   422: aload_3
    //   423: invokevirtual 88	java/io/FileInputStream:close	()V
    //   426: iconst_0
    //   427: ireturn
    //   428: astore_3
    //   429: aload 5
    //   431: astore_3
    //   432: aload_3
    //   433: ifnull -7 -> 426
    //   436: aload_3
    //   437: invokevirtual 88	java/io/FileInputStream:close	()V
    //   440: goto -14 -> 426
    //   443: astore_3
    //   444: goto -18 -> 426
    //   447: astore 4
    //   449: aconst_null
    //   450: astore_3
    //   451: aload_3
    //   452: ifnull +7 -> 459
    //   455: aload_3
    //   456: invokevirtual 88	java/io/FileInputStream:close	()V
    //   459: aload 4
    //   461: athrow
    //   462: astore_3
    //   463: goto -342 -> 121
    //   466: astore 4
    //   468: goto -200 -> 268
    //   471: astore_3
    //   472: goto -57 -> 415
    //   475: astore_3
    //   476: goto -50 -> 426
    //   479: astore_3
    //   480: goto -21 -> 459
    //   483: astore 4
    //   485: goto -34 -> 451
    //   488: astore 4
    //   490: goto -58 -> 432
    //   493: astore 4
    //   495: goto -88 -> 407
    //   498: astore 4
    //   500: goto -112 -> 388
    //   503: astore 4
    //   505: goto -135 -> 370
    //   508: astore 6
    //   510: aload_3
    //   511: astore 4
    //   513: aload 6
    //   515: astore_3
    //   516: goto -258 -> 258
    //   519: astore 4
    //   521: goto -282 -> 239
    //   524: astore 4
    //   526: goto -305 -> 221
    //   529: iconst_1
    //   530: ireturn
    //   531: iload_0
    //   532: iconst_1
    //   533: iadd
    //   534: istore_0
    //   535: goto -523 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	524	0	i	int
    //   9	6	1	j	int
    //   49	286	2	bool	boolean
    //   6	94	3	localObject1	Object
    //   105	13	3	localException1	Exception
    //   130	80	3	localFileInputStream	java.io.FileInputStream
    //   215	1	3	localIOException1	IOException
    //   218	1	3	localFileNotFoundException1	FileNotFoundException
    //   220	6	3	localObject2	Object
    //   232	1	3	localException2	Exception
    //   236	1	3	localIOException2	IOException
    //   238	6	3	localObject3	Object
    //   250	1	3	localException3	Exception
    //   254	15	3	localObject4	Object
    //   270	1	3	localNoSuchFieldError	NoSuchFieldError
    //   304	35	3	localRandomAccessFile	java.io.RandomAccessFile
    //   344	13	3	localException4	Exception
    //   363	1	3	localException5	Exception
    //   367	1	3	localFileNotFoundException2	FileNotFoundException
    //   369	6	3	localObject5	Object
    //   381	1	3	localException6	Exception
    //   385	1	3	localIOException3	IOException
    //   387	6	3	localObject6	Object
    //   399	1	3	localException7	Exception
    //   406	17	3	localObject7	Object
    //   428	1	3	localException8	Exception
    //   431	6	3	localObject8	Object
    //   443	1	3	localIOException4	IOException
    //   450	6	3	localObject9	Object
    //   462	1	3	localException9	Exception
    //   471	1	3	localException10	Exception
    //   475	1	3	localIOException5	IOException
    //   479	32	3	localIOException6	IOException
    //   515	1	3	localObject10	Object
    //   70	282	4	localObject11	Object
    //   403	13	4	localObject12	Object
    //   447	13	4	localObject13	Object
    //   466	1	4	localException11	Exception
    //   483	1	4	localObject14	Object
    //   488	1	4	localException12	Exception
    //   493	1	4	localObject15	Object
    //   498	1	4	localIOException7	IOException
    //   503	1	4	localFileNotFoundException3	FileNotFoundException
    //   511	1	4	localIOException8	IOException
    //   519	1	4	localIOException9	IOException
    //   524	1	4	localFileNotFoundException4	FileNotFoundException
    //   1	429	5	localObject16	Object
    //   508	6	6	localObject17	Object
    // Exception table:
    //   from	to	target	type
    //   99	103	105	java/lang/Exception
    //   209	213	215	java/io/IOException
    //   54	66	218	java/io/FileNotFoundException
    //   225	229	232	java/lang/Exception
    //   54	66	236	java/io/IOException
    //   243	247	250	java/lang/Exception
    //   54	66	254	finally
    //   3	10	270	java/lang/NoSuchFieldError
    //   17	28	270	java/lang/NoSuchFieldError
    //   30	50	270	java/lang/NoSuchFieldError
    //   99	103	270	java/lang/NoSuchFieldError
    //   117	121	270	java/lang/NoSuchFieldError
    //   225	229	270	java/lang/NoSuchFieldError
    //   243	247	270	java/lang/NoSuchFieldError
    //   263	268	270	java/lang/NoSuchFieldError
    //   268	270	270	java/lang/NoSuchFieldError
    //   338	342	344	java/lang/Exception
    //   356	360	363	java/lang/Exception
    //   293	305	367	java/io/FileNotFoundException
    //   374	378	381	java/lang/Exception
    //   293	305	385	java/io/IOException
    //   392	396	399	java/lang/Exception
    //   293	305	403	finally
    //   121	131	428	java/lang/Exception
    //   436	440	443	java/io/IOException
    //   121	131	447	finally
    //   117	121	462	java/lang/Exception
    //   263	268	466	java/lang/Exception
    //   411	415	471	java/lang/Exception
    //   422	426	475	java/io/IOException
    //   455	459	479	java/io/IOException
    //   131	148	483	finally
    //   131	148	488	java/lang/Exception
    //   305	311	493	finally
    //   316	334	493	finally
    //   347	353	493	finally
    //   305	311	498	java/io/IOException
    //   316	334	498	java/io/IOException
    //   347	353	498	java/io/IOException
    //   305	311	503	java/io/FileNotFoundException
    //   316	334	503	java/io/FileNotFoundException
    //   347	353	503	java/io/FileNotFoundException
    //   66	72	508	finally
    //   77	95	508	finally
    //   108	114	508	finally
    //   66	72	519	java/io/IOException
    //   77	95	519	java/io/IOException
    //   108	114	519	java/io/IOException
    //   66	72	524	java/io/FileNotFoundException
    //   77	95	524	java/io/FileNotFoundException
    //   108	114	524	java/io/FileNotFoundException
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      Object localObject1 = Class.forName(a("q~tbyt>q``>QsdyfydiDxbuqt"));
      Object localObject2 = ((Class)localObject1).getDeclaredMethod(a("sebbu~dQsdyfydiDxbuqt"), new Class[0]);
      ((Method)localObject2).setAccessible(true);
      localObject2 = ((Method)localObject2).invoke(null, new Object[0]);
      localObject1 = ((Class)localObject1).getDeclaredMethod(a("wud@bsucc^q}u"), new Class[0]);
      ((Method)localObject1).setAccessible(true);
      localObject1 = (String)((Method)localObject1).invoke(localObject2, new Object[0]);
      boolean bool = paramContext.getPackageName().equalsIgnoreCase((String)localObject1);
      return bool;
    }
    catch (Throwable paramContext) {}
    return true;
  }
  
  /* Error */
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: new 131	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   7: aload_2
    //   8: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: ldc -117
    //   13: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: aload_3
    //   17: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: astore_3
    //   24: new 144	java/io/File
    //   27: dup
    //   28: aload_2
    //   29: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: astore_2
    //   33: aload_2
    //   34: invokevirtual 148	java/io/File:exists	()Z
    //   37: ifne +8 -> 45
    //   40: aload_2
    //   41: invokevirtual 151	java/io/File:mkdir	()Z
    //   44: pop
    //   45: new 144	java/io/File
    //   48: dup
    //   49: aload_3
    //   50: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   53: astore 5
    //   55: aload 5
    //   57: invokevirtual 148	java/io/File:exists	()Z
    //   60: ifeq +94 -> 154
    //   63: aload_0
    //   64: invokevirtual 155	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   67: invokevirtual 161	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   70: aload_1
    //   71: invokevirtual 167	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   74: astore_2
    //   75: new 78	java/io/FileInputStream
    //   78: dup
    //   79: aload 5
    //   81: invokespecial 170	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   84: astore 5
    //   86: new 172	java/io/BufferedInputStream
    //   89: dup
    //   90: aload_2
    //   91: invokespecial 175	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: astore 6
    //   96: new 172	java/io/BufferedInputStream
    //   99: dup
    //   100: aload 5
    //   102: invokespecial 175	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   105: astore 7
    //   107: aload 6
    //   109: aload 7
    //   111: invokestatic 178	com/qihoo/util/a:a	(Ljava/io/BufferedInputStream;Ljava/io/BufferedInputStream;)Z
    //   114: ifeq +156 -> 270
    //   117: iconst_1
    //   118: istore 4
    //   120: aload_2
    //   121: invokevirtual 181	java/io/InputStream:close	()V
    //   124: aload 5
    //   126: invokevirtual 181	java/io/InputStream:close	()V
    //   129: aload 6
    //   131: invokevirtual 182	java/io/BufferedInputStream:close	()V
    //   134: aload 7
    //   136: invokevirtual 182	java/io/BufferedInputStream:close	()V
    //   139: iload 4
    //   141: ifeq +13 -> 154
    //   144: aconst_null
    //   145: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   148: aconst_null
    //   149: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   152: iconst_1
    //   153: ireturn
    //   154: aload_0
    //   155: invokevirtual 155	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   158: invokevirtual 161	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   161: aload_1
    //   162: invokevirtual 167	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   165: astore_0
    //   166: new 186	java/io/FileOutputStream
    //   169: dup
    //   170: aload_3
    //   171: invokespecial 187	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   174: astore_2
    //   175: sipush 7168
    //   178: newarray <illegal type>
    //   180: astore_1
    //   181: aload_0
    //   182: aload_1
    //   183: invokevirtual 188	java/io/InputStream:read	([B)I
    //   186: istore 4
    //   188: iload 4
    //   190: ifle +27 -> 217
    //   193: aload_2
    //   194: aload_1
    //   195: iconst_0
    //   196: iload 4
    //   198: invokevirtual 192	java/io/FileOutputStream:write	([BII)V
    //   201: goto -20 -> 181
    //   204: astore_1
    //   205: aload_2
    //   206: astore_1
    //   207: aload_1
    //   208: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   211: aload_0
    //   212: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   215: iconst_0
    //   216: ireturn
    //   217: aload_2
    //   218: invokevirtual 195	java/io/FileOutputStream:flush	()V
    //   221: aload_2
    //   222: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   225: aload_0
    //   226: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   229: iconst_1
    //   230: ireturn
    //   231: astore_1
    //   232: aconst_null
    //   233: astore_2
    //   234: aconst_null
    //   235: astore_0
    //   236: aload_2
    //   237: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   240: aload_0
    //   241: invokestatic 184	com/qihoo/util/a:a	(Ljava/io/Closeable;)V
    //   244: aload_1
    //   245: athrow
    //   246: astore_1
    //   247: aconst_null
    //   248: astore_2
    //   249: goto -13 -> 236
    //   252: astore_1
    //   253: goto -17 -> 236
    //   256: astore_0
    //   257: aconst_null
    //   258: astore_1
    //   259: aconst_null
    //   260: astore_0
    //   261: goto -54 -> 207
    //   264: astore_1
    //   265: aconst_null
    //   266: astore_1
    //   267: goto -60 -> 207
    //   270: iconst_0
    //   271: istore 4
    //   273: goto -153 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramContext	Context
    //   0	276	1	paramString1	String
    //   0	276	2	paramString2	String
    //   0	276	3	paramString3	String
    //   118	154	4	i	int
    //   53	72	5	localObject	Object
    //   94	36	6	localBufferedInputStream1	BufferedInputStream
    //   105	30	7	localBufferedInputStream2	BufferedInputStream
    // Exception table:
    //   from	to	target	type
    //   175	181	204	java/lang/Exception
    //   181	188	204	java/lang/Exception
    //   193	201	204	java/lang/Exception
    //   217	221	204	java/lang/Exception
    //   45	117	231	finally
    //   120	139	231	finally
    //   154	166	231	finally
    //   166	175	246	finally
    //   175	181	252	finally
    //   181	188	252	finally
    //   193	201	252	finally
    //   217	221	252	finally
    //   45	117	256	java/lang/Exception
    //   120	139	256	java/lang/Exception
    //   154	166	256	java/lang/Exception
    //   166	175	264	java/lang/Exception
  }
  
  private static boolean a(BufferedInputStream paramBufferedInputStream1, BufferedInputStream paramBufferedInputStream2)
  {
    try
    {
      int j = paramBufferedInputStream1.available();
      int i = paramBufferedInputStream2.available();
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      if (j == i)
      {
        arrayOfByte1 = new byte[j];
        arrayOfByte2 = new byte[i];
        paramBufferedInputStream1.read(arrayOfByte1);
        paramBufferedInputStream2.read(arrayOfByte2);
        i = 0;
      }
      while (i < j)
      {
        int k = arrayOfByte1[i];
        int m = arrayOfByte2[i];
        if (k != m) {
          return false;
        }
        i += 1;
      }
      return true;
    }
    catch (IOException paramBufferedInputStream1)
    {
      return false;
    }
    catch (FileNotFoundException paramBufferedInputStream1) {}
    return false;
  }
  
  public static void b()
  {
    if (Build.VERSION.SDK_INT != 28) {
      return;
    }
    try
    {
      Class.forName(a("q~tbyt>s~du~d>`}>@qs{qwu@qbcub4@qs{qwu")).getDeclaredConstructor(new Class[] { String.class }).setAccessible(true);
      try
      {
        Object localObject1 = Class.forName(a("q~tbyt>q``>QsdyfydiDxbuqt"));
        Object localObject2 = ((Class)localObject1).getDeclaredMethod(a("sebbu~dQsdyfydiDxbuqt"), new Class[0]);
        ((Method)localObject2).setAccessible(true);
        localObject2 = ((Method)localObject2).invoke(null, new Object[0]);
        localObject1 = ((Class)localObject1).getDeclaredField(a("}Xyttu~Q`yGqb~y~wCxg~"));
        ((Field)localObject1).setAccessible(true);
        ((Field)localObject1).setBoolean(localObject2, true);
        return;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.qihoo.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
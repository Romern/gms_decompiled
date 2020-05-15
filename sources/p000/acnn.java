package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnn {

    /* renamed from: a */
    public static final Object f60254a = new Object();

    /* renamed from: e */
    public static acnn f60255e;

    /* renamed from: b */
    public final Context f60256b;

    /* renamed from: c */
    public final String f60257c;

    /* renamed from: d */
    public final String f60258d;

    public acnn(Context context, String str, String str2) {
        this.f60256b = context;
        this.f60257c = str;
        this.f60258d = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List
     arg types: [java.nio.ByteBuffer, java.lang.Class, bxxk, int]
     candidates:
      stb.a(java.nio.ByteBuffer, byte[], int, int):void
      stb.a(byte[], int, int, long):boolean
      stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC, Splitter:B:25:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A[SYNTHETIC, Splitter:B:34:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0077 A[SYNTHETIC, Splitter:B:44:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008d A[RETURN] */
    /* renamed from: a */
    public final List mo32920a() {
        List list;
        FileInputStream fileInputStream;
        String str;
        String str2;
        Throwable th;
        synchronized (f60254a) {
            list = null;
            FileInputStream fileInputStream2 = null;
            list = null;
            list = null;
            list = null;
            list = null;
            list = null;
            try {
                File fileStreamPath = this.f60256b.getFileStreamPath(this.f60257c);
                fileInputStream = new FileInputStream(fileStreamPath);
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileStreamPath.length());
                    fileInputStream.getChannel().read(allocate);
                    allocate.rewind();
                    list = stb.m36277a(allocate, aclj.class, (bxxk) aclj.f60087e.mo74142c(7), false);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        str = "Failed to close stream for %s";
                        str2 = this.f60257c;
                        acnv.m49542a(str, str2);
                        if (list != null) {
                        }
                    }
                } catch (FileNotFoundException e2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            str = "Failed to close stream for %s";
                            str2 = this.f60257c;
                            acnv.m49542a(str, str2);
                            if (list != null) {
                            }
                        }
                    }
                    if (list != null) {
                    }
                } catch (IOException e4) {
                    try {
                        acnv.m49557e("Failed to read stream for %s", this.f60257c);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                str = "Failed to close stream for %s";
                                str2 = this.f60257c;
                                acnv.m49542a(str, str2);
                                if (list != null) {
                                }
                            }
                        }
                        if (list != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e6) {
                                acnv.m49542a("Failed to close stream for %s", this.f60257c);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                fileInputStream = null;
                if (fileInputStream != null) {
                }
                if (list != null) {
                }
            } catch (IOException e8) {
                fileInputStream = null;
                acnv.m49557e("Failed to read stream for %s", this.f60257c);
                if (fileInputStream != null) {
                }
                if (list != null) {
                }
            } catch (Throwable th4) {
                th = th4;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
        }
        return list != null ? new ArrayList() : list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b A[SYNTHETIC, Splitter:B:37:0x005b] */
    /* renamed from: b */
    public final List mo32924b() {
        String str;
        String str2;
        BufferedReader bufferedReader;
        IOException e;
        ArrayList arrayList = new ArrayList();
        synchronized (f60254a) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(this.f60256b.getFileStreamPath(this.f60258d)));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            arrayList.add(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                str2 = "Failed to close component name file %s";
                                str = this.f60258d;
                                acnv.m49542a(str2, str);
                                return arrayList;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        try {
                            acnv.m49544a(e, "Failed to read from component name file %s", this.f60258d);
                            if (bufferedReader != null) {
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e4) {
                                    acnv.m49542a("Failed to close component name file %s", this.f60258d);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (IOException e5) {
                bufferedReader = null;
                e = e5;
                acnv.m49544a(e, "Failed to read from component name file %s", this.f60258d);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e6) {
                        str2 = "Failed to close component name file %s";
                        str = this.f60258d;
                        acnv.m49542a(str2, str);
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader2 != null) {
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC, Splitter:B:36:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0072 A[SYNTHETIC, Splitter:B:47:0x0072] */
    /* renamed from: a */
    public final void mo32921a(Iterable iterable) {
        String str;
        String str2;
        synchronized (f60254a) {
            PrintWriter printWriter = null;
            try {
                File createTempFile = File.createTempFile("tmp", this.f60258d);
                PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(createTempFile, false)));
                try {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        printWriter2.println((String) it.next());
                    }
                    printWriter2.close();
                    File fileStreamPath = this.f60256b.getFileStreamPath(this.f60258d);
                    synchronized (f60254a) {
                        createTempFile.renameTo(fileStreamPath);
                    }
                } catch (IOException e) {
                    e = e;
                    printWriter = printWriter2;
                    try {
                        acnv.m49544a(e, "Failed to open Apps corpus file.", new Object[0]);
                        if (printWriter != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (printWriter != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printWriter = printWriter2;
                    if (printWriter != null) {
                    }
                    throw th;
                }
                try {
                    printWriter2.close();
                } catch (RuntimeException e2) {
                    str = "Failed to close file %s";
                    str2 = this.f60258d;
                    acnv.m49542a(str, str2);
                }
            } catch (IOException e3) {
                e = e3;
                acnv.m49544a(e, "Failed to open Apps corpus file.", new Object[0]);
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (RuntimeException e4) {
                        str = "Failed to close file %s";
                        str2 = this.f60258d;
                        acnv.m49542a(str, str2);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (RuntimeException e5) {
                        acnv.m49542a("Failed to close file %s", this.f60258d);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[SYNTHETIC, Splitter:B:30:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c A[SYNTHETIC, Splitter:B:41:0x009c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo32922a(Iterable r9, int i, long j) {
        String str;
        String str2;
        bngs bngs = new bngs();
        int size = r9.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) r9.get(i2);
            j++;
            bxvd da = aclj.f60087e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aclj aclj = (aclj) da.f164949b;
            str3.getClass();
            int i3 = aclj.f60089a | 2;
            aclj.f60089a = i3;
            aclj.f60091c = str3;
            aclj.f60090b = i - 1;
            int i4 = i3 | 1;
            aclj.f60089a = i4;
            aclj.f60089a = i4 | 4;
            aclj.f60092d = j;
            bngs.mo67668c((aclj) da.mo74062i());
        }
        ByteBuffer a = stb.m36276a(bngs.mo67664a(), false);
        if (a != null) {
            synchronized (f60254a) {
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = this.f60256b.openFileOutput(this.f60257c, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
                    try {
                        fileOutputStream.getChannel().write(a);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e) {
                                str2 = "Failed to close stream for %s";
                                str = this.f60257c;
                                acnv.m49542a(str2, str);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            acnv.m49544a(e, "Failed to open Apps corpus file.", new Object[0]);
                            if (fileOutputStream != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    acnv.m49544a(e, "Failed to open Apps corpus file.", new Object[0]);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            str2 = "Failed to close stream for %s";
                            str = this.f60257c;
                            acnv.m49542a(str2, str);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            acnv.m49542a("Failed to close stream for %s", this.f60257c);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC, Splitter:B:41:0x006a] */
    /* renamed from: a */
    public final void mo32923a(List list) {
        String str;
        acnv.m49542a("replaceAllEntries size %d", Integer.valueOf(list.size()));
        ByteBuffer a = stb.m36276a(list, false);
        if (a != null) {
            FileOutputStream fileOutputStream = null;
            try {
                File createTempFile = File.createTempFile("tmp", this.f60257c);
                FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream2.getChannel().write(a);
                    fileOutputStream2.close();
                    File fileStreamPath = this.f60256b.getFileStreamPath(this.f60257c);
                    synchronized (f60254a) {
                        createTempFile.renameTo(fileStreamPath);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        str = this.f60257c;
                        acnv.m49542a("Failed to close stream for %s", str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    acnv.m49544a(e, "Failed to write entries to Apps corpus file.", new Object[0]);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            str = this.f60257c;
                            acnv.m49542a("Failed to close stream for %s", str);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            acnv.m49542a("Failed to close stream for %s", this.f60257c);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream != null) {
                }
                throw th;
            }
        }
    }
}

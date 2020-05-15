package p000;

import android.content.ComponentName;
import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: adnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnf {

    /* renamed from: a */
    public static final Object f62206a = new Object();

    /* renamed from: b */
    public final Context f62207b;

    public adnf(Context context) {
        this.f62207b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[SYNTHETIC, Splitter:B:26:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005e A[SYNTHETIC, Splitter:B:36:0x005e] */
    /* renamed from: a */
    public final Set mo33674a() {
        BufferedReader bufferedReader;
        IOException e;
        HashSet hashSet = new HashSet();
        synchronized (f62206a) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(this.f62207b.getFileStreamPath("apps_3p_corpus_component_names.txt")));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(readLine);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString);
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                new Object[1][0] = "apps_3p_corpus_component_names.txt";
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        try {
                            adnt.m50873b(e, "Failed to read from component name file apps_3p_corpus_component_names.txt", new Object[0]);
                            if (bufferedReader != null) {
                            }
                            return hashSet;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
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
            } catch (IOException e4) {
                bufferedReader = null;
                e = e4;
                adnt.m50873b(e, "Failed to read from component name file apps_3p_corpus_component_names.txt", new Object[0]);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        new Object[1][0] = "apps_3p_corpus_component_names.txt";
                    }
                }
                return hashSet;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e6) {
                        new Object[1][0] = "apps_3p_corpus_component_names.txt";
                    }
                }
                throw th;
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[SYNTHETIC, Splitter:B:35:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC, Splitter:B:44:0x0078] */
    /* renamed from: a */
    public final void mo33675a(Iterable iterable) {
        synchronized (f62206a) {
            PrintWriter printWriter = null;
            try {
                File createTempFile = File.createTempFile("tmp", "apps_3p_corpus_component_names.txt");
                PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(createTempFile, false)));
                try {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        printWriter2.println(((ComponentName) it.next()).flattenToString());
                    }
                    printWriter2.close();
                    File fileStreamPath = this.f62207b.getFileStreamPath("apps_3p_corpus_component_names.txt");
                    synchronized (f62206a) {
                        createTempFile.renameTo(fileStreamPath);
                    }
                    try {
                        printWriter2.close();
                    } catch (RuntimeException e) {
                        new Object[1][0] = "apps_3p_corpus_component_names.txt";
                    }
                } catch (IOException e2) {
                    e = e2;
                    printWriter = printWriter2;
                    try {
                        adnt.m50873b(e, "Failed to open Apps corpus file.", new Object[0]);
                        if (printWriter != null) {
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (RuntimeException e3) {
                                new Object[1][0] = "apps_3p_corpus_component_names.txt";
                            }
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
            } catch (IOException e4) {
                e = e4;
                adnt.m50873b(e, "Failed to open Apps corpus file.", new Object[0]);
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (RuntimeException e5) {
                        new Object[1][0] = "apps_3p_corpus_component_names.txt";
                    }
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                if (printWriter != null) {
                }
                throw th;
            }
        }
        return;
    }
}

package p000;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: acxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxk {

    /* renamed from: a */
    public final Object f61016a = new Object();

    /* renamed from: b */
    public boolean f61017b = false;

    /* renamed from: c */
    public final File f61018c;

    /* renamed from: d */
    public int f61019d = 0;

    /* renamed from: e */
    public final boolean f61020e;

    public acxk(File file, boolean z) {
        this.f61018c = new File(file, "query-record-log.tmp");
        this.f61020e = z;
    }

    /* renamed from: a */
    public static byte[] m49938a(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List
     arg types: [java.nio.ByteBuffer, java.lang.Class, bxxk, int]
     candidates:
      stb.a(java.nio.ByteBuffer, byte[], int, int):void
      stb.a(byte[], int, int, long):boolean
      stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073 A[SYNTHETIC, Splitter:B:33:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098 A[SYNTHETIC, Splitter:B:46:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3 A[SYNTHETIC, Splitter:B:56:0x00b3] */
    /* renamed from: b */
    public final List mo33200b() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (this.f61016a) {
            FileInputStream fileInputStream2 = null;
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) this.f61018c.length());
                try {
                    fileInputStream = new FileInputStream(this.f61018c);
                    try {
                        fileInputStream.getChannel().read(allocate);
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            absg.m48195b(e, "Error while closing stream to %s", this.f61018c.getName());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        allocate.rewind();
                        List a = stb.m36277a(allocate, abtt.class, (bxxk) abtt.f58306c.mo74142c(7), false);
                        if (a != null) {
                            return a;
                        }
                        absg.m48192b("Failed to read from record file %s", this.f61018c.getName());
                        return null;
                    } catch (FileNotFoundException e2) {
                        absg.m48206e("Record file %s not found, ignoring", this.f61018c.getAbsolutePath());
                        if (fileInputStream != null) {
                        }
                        return null;
                    } catch (IOException e3) {
                        e = e3;
                        try {
                            absg.m48195b(e, "Error while reading from %s", this.f61018c.getName());
                            if (fileInputStream != null) {
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e4) {
                    fileInputStream = null;
                    absg.m48206e("Record file %s not found, ignoring", this.f61018c.getAbsolutePath());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            absg.m48195b(e5, "Error while closing stream to %s", this.f61018c.getName());
                        }
                    }
                    return null;
                } catch (IOException e6) {
                    e = e6;
                    fileInputStream = null;
                    absg.m48195b(e, "Error while reading from %s", this.f61018c.getName());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e7) {
                            absg.m48195b(e7, "Error while closing stream to %s", this.f61018c.getName());
                        }
                    }
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e8) {
                            absg.m48195b(e8, "Error while closing stream to %s", this.f61018c.getName());
                        }
                    }
                    throw th;
                }
            } catch (IllegalArgumentException e9) {
                absg.m48195b(e9, "Error while reading from %s: file too large: %s", this.f61018c.getName(), acky.m49361a(this.f61018c.length()));
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5 A[SYNTHETIC, Splitter:B:53:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c0 A[SYNTHETIC, Splitter:B:63:0x00c0] */
    /* renamed from: a */
    public final void mo33198a(abtt abtt) {
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        boolean z;
        synchronized (this.f61016a) {
            if (this.f61017b) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(abtt);
                FileOutputStream fileOutputStream2 = null;
                try {
                    int i = this.f61019d;
                    if (i < 5) {
                        this.f61019d = i + 1;
                        z = true;
                    } else {
                        List b = mo33200b();
                        if (b == null || b.size() != 5) {
                            absg.m48191b("Inconsistent record file, overwriting");
                            this.f61019d = 1;
                            z = false;
                        } else {
                            linkedList.addAll(0, b.subList(1, 5));
                            z = false;
                        }
                    }
                    ByteBuffer a = stb.m36276a(linkedList, false);
                    if (a != null) {
                        fileOutputStream = new FileOutputStream(this.f61018c, z);
                        try {
                            if (fileOutputStream.getChannel().write(a) == 0) {
                                absg.m48205e("No bytes written to replay file");
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    absg.m48195b(e2, "Error while closing stream to %s", this.f61018c.getPath());
                                }
                            } else {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    absg.m48195b(e3, "Error while closing stream to %s", this.f61018c.getPath());
                                }
                            }
                        } catch (IOException e4) {
                            e = e4;
                            try {
                                absg.m48195b(e, "Error while writing to %s", this.f61018c.getPath());
                                if (fileOutputStream != null) {
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                if (fileOutputStream2 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        absg.m48205e("Failed to serialize records");
                        return;
                    }
                } catch (IOException e5) {
                    fileOutputStream = null;
                    e = e5;
                    absg.m48195b(e, "Error while writing to %s", this.f61018c.getPath());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            absg.m48195b(e6, "Error while closing stream to %s", this.f61018c.getPath());
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            absg.m48195b(e7, "Error while closing stream to %s", this.f61018c.getPath());
                        }
                    }
                    throw th;
                }
            } else {
                absg.m48184a("Unexpectedly stopped recording");
            }
        }
        return;
        return;
    }

    /* renamed from: a */
    public final boolean mo33199a() {
        boolean z;
        if (this.f61020e) {
            return false;
        }
        synchronized (this.f61016a) {
            z = this.f61017b;
        }
        return z;
    }
}

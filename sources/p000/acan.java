package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: acan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acan implements acam {

    /* renamed from: a */
    public final SharedPreferences f59109a;

    /* renamed from: b */
    public final acxj f59110b;

    /* renamed from: c */
    public Mac f59111c;

    /* renamed from: d */
    private final SecureRandom f59112d = new SecureRandom();

    public acan(Context context, String str, File file) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("AppDataSearch-");
        sb.append(str);
        sb.append("-config");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.f59109a = sharedPreferences;
        if (!sharedPreferences.contains("created")) {
            this.f59109a.edit().putLong("created", System.currentTimeMillis()).commit();
        }
        mo32591b();
        this.f59110b = new acxj(new File(file, String.valueOf(str).concat("-corpus-scratch-data.tmp")), abst.class, (bxxk) abst.f58159e.mo74142c(7));
    }

    /* renamed from: a */
    public final String mo32590a(acak acak) {
        byte[] bytes = acak.f59106a.getBytes(Charset.defaultCharset());
        byte[] bytes2 = acak.f59107b.getBytes(Charset.defaultCharset());
        this.f59111c.reset();
        this.f59111c.update(bytes);
        this.f59111c.update((byte) 45);
        this.f59111c.update(bytes2);
        String d = srv.m36164d(this.f59111c.doFinal());
        if (acak.f59108c == null) {
            return d;
        }
        String valueOf = String.valueOf(d);
        String str = acak.f59108c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo32591b() {
        bmxy.m108581a(this.f59109a);
        String string = this.f59109a.getString("hmackey", null);
        if (string == null) {
            byte[] bArr = new byte[20];
            this.f59112d.nextBytes(bArr);
            string = srv.m36164d(bArr);
            this.f59109a.edit().putString("hmackey", string).commit();
        }
        try {
            Mac a = acky.m49363a("HmacSHA1");
            this.f59111c = a;
            if (a != null) {
                this.f59111c.init(new SecretKeySpec(string.getBytes("UTF-8"), "HmacSHA1"));
                return;
            }
            throw new IllegalArgumentException("Cannot find algo");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("CannotHappenException", e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException("Bad key type", e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List
     arg types: [java.nio.ByteBuffer, java.lang.Class, bxxk, int]
     candidates:
      stb.a(java.nio.ByteBuffer, byte[], int, int):void
      stb.a(byte[], int, int, long):boolean
      stb.a(java.nio.ByteBuffer, java.lang.Class, bxxk, boolean):java.util.List */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[SYNTHETIC, Splitter:B:30:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5 A[SYNTHETIC, Splitter:B:40:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9 A[SYNTHETIC, Splitter:B:47:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* renamed from: a */
    public final Collection mo32588a() {
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(this.f59109a.getAll().size());
        for (Map.Entry<String, ?> entry : this.f59109a.getAll().entrySet()) {
            if (entry.getKey().startsWith("corpuskey:")) {
                arrayList.add((abss) acky.m49358a((String) entry.getValue(), (bxxk) abss.f58154d.mo74142c(7)));
            }
        }
        acxj acxj = this.f59110b;
        absg.m48202d("Requested read of file %s", acxj.f61014c);
        List list = null;
        FileInputStream fileInputStream2 = null;
        list = null;
        list = null;
        list = null;
        list = null;
        list = null;
        list = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) acxj.f61015d.length());
            try {
                fileInputStream = new FileInputStream(acxj.f61015d);
                try {
                    fileInputStream.getChannel().read(allocate);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        absg.m48195b(e, "Error while closing stream to %s", acxj.f61014c);
                    }
                    allocate.rewind();
                    absg.m48185a("Reading file %s", acxj.f61014c);
                    list = stb.m36277a(allocate, acxj.f61012a, acxj.f61013b, true);
                    if (list == null) {
                        absg.m48192b("Failed to read valid data from file %s", acxj.f61014c);
                    }
                } catch (FileNotFoundException e2) {
                    absg.m48202d("File %s not found, ignoring", acxj.f61014c);
                    if (fileInputStream != null) {
                    }
                    if (list != null) {
                    }
                    return arrayList;
                } catch (IOException e3) {
                    e = e3;
                    try {
                        absg.m48195b(e, "Error while reading from %s", acxj.f61014c);
                        if (fileInputStream != null) {
                        }
                        if (list != null) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream = null;
                absg.m48202d("File %s not found, ignoring", acxj.f61014c);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        absg.m48195b(e5, "Error while closing stream to %s", acxj.f61014c);
                    }
                }
                if (list != null) {
                }
                return arrayList;
            } catch (IOException e6) {
                e = e6;
                fileInputStream = null;
                absg.m48195b(e, "Error while reading from %s", acxj.f61014c);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e7) {
                        absg.m48195b(e7, "Error while closing stream to %s", acxj.f61014c);
                    }
                }
                if (list != null) {
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e8) {
                        absg.m48195b(e8, "Error while closing stream to %s", acxj.f61014c);
                    }
                }
                throw th;
            }
        } catch (IllegalArgumentException e9) {
            absg.m48195b(e9, "Error while reading from %s: file too large: %s", acxj.f61014c, acky.m49361a(acxj.f61015d.length()));
        }
        if (list != null) {
            SparseArray sparseArray = new SparseArray(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                abst abst = (abst) list.get(i);
                sparseArray.append(abst.f58162b, abst);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                abss abss = (abss) arrayList.get(i2);
                absr absr = abss.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                abst abst2 = (abst) sparseArray.get(absr.f58137b);
                if (abst2 != null) {
                    bxvd bxvd = (bxvd) abss.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) abss);
                    absy absy = abss.f58158c;
                    if (absy == null) {
                        absy = absy.f58176h;
                    }
                    bxvd bxvd2 = (bxvd) absy.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) absy);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    ((absy) bxvd2.f164949b).f58179b = GeneratedMessageLite.m124030de();
                    bxvd2.mo73950M(abst2.f58164d);
                    int i3 = abst2.f58163c;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    absy absy2 = (absy) bxvd2.f164949b;
                    absy2.f58178a |= 16;
                    absy2.f58182e = i3;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abss abss2 = (abss) bxvd.f164949b;
                    absy absy3 = (absy) bxvd2.mo74062i();
                    abss abss3 = abss.f58154d;
                    absy3.getClass();
                    abss2.f58158c = absy3;
                    abss2.f58156a |= 2;
                    arrayList.set(i2, (abss) bxvd.mo74062i());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo32589a(abss abss) {
        String valueOf = String.valueOf(mo32590a(new acak(abss)));
        return this.f59109a.edit().putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), acky.m49362a(abss)).commit();
    }
}

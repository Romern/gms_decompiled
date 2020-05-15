package com.google.android.gms.ads.internal.clearcut;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.clearcut.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0327b {

    /* renamed from: a */
    private final C0331f f8091a;

    /* renamed from: b */
    private final boolean f8092b;

    /* renamed from: c */
    private final bxvd f8093c;

    public C0327b() {
        this.f8093c = C0332g.f8102e.mo74144da();
        this.f8092b = false;
        this.f8091a = new C0331f();
    }

    /* renamed from: b */
    private final synchronized void m5260b(int i) {
        bxvd bxvd = this.f8093c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0332g gVar = C0332g.f8102e;
        ((C0332g) bxvd.f164949b).f8106c = bxvk.m124029dd();
        List<String> b = C0371o.m5341b();
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException e) {
                }
            }
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0332g gVar2 = (C0332g) bxvd.f164949b;
        if (!gVar2.f8106c.mo73666a()) {
            gVar2.f8106c = bxvk.m124020a(gVar2.f8106c);
        }
        bxsy.m123078a(arrayList, gVar2.f8106c);
        C0330e a = this.f8091a.mo6570a(((C0332g) this.f8093c.mo74062i()).mo73642k());
        int i2 = i - 1;
        a.f8097b = i2;
        a.mo6569a();
        String valueOf = String.valueOf(Integer.toString(i2, 10));
        if (valueOf.length() == 0) {
            new String("Logging Event with event code : ");
        } else {
            "Logging Event with event code : ".concat(valueOf);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: c */
    private final synchronized void m5261c(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                fileOutputStream.write(m5262d(i).getBytes());
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                fileOutputStream.close();
            } catch (FileNotFoundException e3) {
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                }
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final synchronized String m5262d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((C0332g) this.f8093c.f164949b).f8105b, Long.valueOf(C0387d.m5368f().mo20506b()), Integer.valueOf(i - 1), Base64.encodeToString(((C0332g) this.f8093c.mo74062i()).mo73642k(), 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo6566a(int i) {
        if (this.f8092b) {
            if (((Boolean) C0371o.f8237ao.mo6604a()).booleanValue()) {
                m5261c(i);
                return;
            }
            m5260b(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo6567a(C0326a aVar) {
        if (this.f8092b) {
            try {
                aVar.mo6565a(this.f8093c);
            } catch (NullPointerException e) {
                C0387d.m5366d().mo6783a(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public C0327b(C0331f fVar) {
        this.f8093c = C0332g.f8102e.mo74144da();
        this.f8091a = fVar;
        this.f8092b = ((Boolean) C0371o.f8236an.mo6604a()).booleanValue();
    }
}

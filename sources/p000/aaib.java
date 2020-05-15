package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* renamed from: aaib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaib {

    /* renamed from: a */
    final File f28163a;

    /* renamed from: b */
    private final File f28164b;

    /* renamed from: c */
    private final SharedPreferences f28165c;

    /* renamed from: d */
    private final dcg f28166d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaic.a(java.io.File, boolean):void
     arg types: [java.io.File, int]
     candidates:
      aaic.a(java.lang.String, java.io.File):java.io.File
      aaic.a(java.io.File, byte[]):boolean
      aaic.a(java.io.File, boolean):void */
    public aaib(Context context, dcg dcg) {
        this.f28165c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        aaic.m21298a(dir, false);
        this.f28164b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        aaic.m21298a(dir2, true);
        this.f28163a = dir2;
        this.f28166d = dcg;
    }

    /* renamed from: a */
    static String m21288a(dci dci) {
        return srv.m36160a(dci.mo73639aL().mo73780k());
    }

    /* renamed from: b */
    private final File m21289b() {
        File file = new File(this.f28164b, Integer.toString(this.f28166d.f12804f));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: c */
    private final String m21290c() {
        int i = this.f28166d.f12804f;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: d */
    private final String m21291d() {
        int i = this.f28166d.f12804f;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final aaia mo16890a() {
        dci a = mo16891a(1);
        if (a == null) {
            return null;
        }
        String str = a.f12814b;
        return new aaia(a, aaic.m21296a(str, "pcam", m21289b()), aaic.m21296a(str, "pcbc", m21289b()), aaic.m21296a(str, "pcopt", m21289b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final dci mo16891a(int i) {
        String str;
        if (i != 1) {
            str = this.f28165c.getString(m21290c(), null);
        } else {
            str = this.f28165c.getString(m21291d(), null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                dci dci = (dci) bxvk.m124007a(dci.f12811g, bxtx.m123261a(srv.m36161a(str)));
                String str2 = dci.f12814b;
                File a = aaic.m21296a(str2, "pcam", m21289b());
                File a2 = aaic.m21296a(str2, "pcbc", m21289b());
                if (!a.exists() || !a2.exists()) {
                    return null;
                }
                return dci;
            } catch (bxwf e) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5  */
    /* renamed from: a */
    public final boolean mo16892a(dch dch, aaif aaif) {
        boolean z;
        dci a;
        dci a2;
        dci dci = dch.f12808b;
        if (dci == null) {
            dci = dci.f12811g;
        }
        String str = dci.f12814b;
        byte[] k = dch.f12809c.mo73780k();
        byte[] k2 = dch.f12810d.mo73780k();
        if (!(TextUtils.isEmpty(str) || k2 == null || k2.length == 0)) {
            aaic.m21301b(this.f28163a);
            this.f28163a.mkdirs();
            aaic.m21295a(str, this.f28163a).mkdirs();
            File a3 = aaic.m21296a(str, "pcam", this.f28163a);
            if ((k == null || k.length <= 0 || aaic.m21299a(a3, k)) && aaic.m21299a(aaic.m21296a(str, "pcbc", this.f28163a), k2)) {
                dci dci2 = dch.f12808b;
                if (dci2 == null) {
                    dci2 = dci.f12811g;
                }
                File a4 = aaic.m21296a(dci2.f12814b, "pcam", this.f28163a);
                if (a4.exists() && aaif != null && !aaif.mo8474a(a4)) {
                    return false;
                }
                dci dci3 = dch.f12808b;
                if (dci3 == null) {
                    dci3 = dci.f12811g;
                }
                String str2 = dci3.f12814b;
                if (!TextUtils.isEmpty(str2)) {
                    File a5 = aaic.m21296a(str2, "pcam", this.f28163a);
                    File a6 = aaic.m21296a(str2, "pcbc", this.f28163a);
                    File a7 = aaic.m21296a(str2, "pcam", m21289b());
                    File a8 = aaic.m21296a(str2, "pcbc", m21289b());
                    if ((!a5.exists() || a5.renameTo(a7)) && a6.exists() && a6.renameTo(a8)) {
                        bxvd da = dci.f12811g.mo74144da();
                        dci dci4 = dch.f12808b;
                        if (dci4 == null) {
                            dci4 = dci.f12811g;
                        }
                        String str3 = dci4.f12814b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dci dci5 = (dci) da.f164949b;
                        str3.getClass();
                        dci5.f12813a |= 1;
                        dci5.f12814b = str3;
                        dci dci6 = dch.f12808b;
                        if (dci6 == null) {
                            dci6 = dci.f12811g;
                        }
                        String str4 = dci6.f12815c;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dci dci7 = (dci) da.f164949b;
                        str4.getClass();
                        dci7.f12813a |= 2;
                        dci7.f12815c = str4;
                        dci dci8 = dch.f12808b;
                        if (dci8 == null) {
                            dci8 = dci.f12811g;
                        }
                        long j = dci8.f12817e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dci dci9 = (dci) da.f164949b;
                        dci9.f12813a |= 8;
                        dci9.f12817e = j;
                        dci dci10 = dch.f12808b;
                        if (dci10 == null) {
                            dci10 = dci.f12811g;
                        }
                        long j2 = dci10.f12818f;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dci dci11 = (dci) da.f164949b;
                        dci11.f12813a |= 16;
                        dci11.f12818f = j2;
                        dci dci12 = dch.f12808b;
                        if (dci12 == null) {
                            dci12 = dci.f12811g;
                        }
                        long j3 = dci12.f12816d;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        dci dci13 = (dci) da.f164949b;
                        dci13.f12813a |= 4;
                        dci13.f12816d = j3;
                        dci dci14 = (dci) da.mo74062i();
                        dci a9 = mo16891a(1);
                        SharedPreferences.Editor edit = this.f28165c.edit();
                        if (a9 != null && !dci14.f12814b.equals(a9.f12814b)) {
                            edit.putString(m21290c(), m21288a(a9));
                        }
                        edit.putString(m21291d(), m21288a(dci14));
                        if (edit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        HashSet hashSet = new HashSet();
                        a = mo16891a(1);
                        if (a != null) {
                            hashSet.add(a.f12814b);
                        }
                        a2 = mo16891a(2);
                        if (a2 != null) {
                            hashSet.add(a2.f12814b);
                        }
                        for (File file : m21289b().listFiles()) {
                            String name = file.getName();
                            if (!hashSet.contains(name)) {
                                aaic.m21301b(aaic.m21295a(name, m21289b()));
                            }
                        }
                        return z;
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                a = mo16891a(1);
                if (a != null) {
                }
                a2 = mo16891a(2);
                if (a2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }
}

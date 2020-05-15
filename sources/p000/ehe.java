package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.felicanetworks.mfc.BuildConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ehe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ehe {

    /* renamed from: a */
    private final SecureRandom f14927a = new SecureRandom();

    /* renamed from: b */
    private final String f14928b;

    /* renamed from: c */
    private final bqlq f14929c;

    /* renamed from: d */
    private List f14930d;

    /* renamed from: e */
    private final String f14931e;

    /* renamed from: f */
    private final boolean f14932f;

    /* renamed from: g */
    private final byte[] f14933g;

    /* renamed from: h */
    private final byte[] f14934h;

    /* renamed from: i */
    private final byte[] f14935i;

    /* renamed from: j */
    private final byte[] f14936j;

    /* renamed from: k */
    private final List f14937k;

    /* renamed from: l */
    private final boolean f14938l;

    /* renamed from: m */
    private final eib f14939m;

    /* renamed from: n */
    private final egz f14940n;

    /* renamed from: o */
    private final egy f14941o;

    /* renamed from: p */
    private final Boolean f14942p;

    /* renamed from: q */
    private final bnic f14943q;

    /* renamed from: r */
    private final sek f14944r;

    /* renamed from: s */
    private final ipn f14945s;

    /* renamed from: t */
    private final itc f14946t;

    public ehe(String str, bqlq bqlq, List list, String str2, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, List list2, eib eib, itc itc, egz egz, egy egy, Boolean bool, ipn ipn, sek sek) {
        List list3 = list2;
        bnia j = bnic.m109500j();
        boolean z2 = false;
        j.mo67753b((Object[]) new String[]{"fido:hardware_protected_uv", "fido:software_optional_uv", "fido:strongbox_protected_up"});
        this.f14943q = j.mo67751a();
        this.f14928b = str;
        this.f14929c = bqlq;
        bmxy.m108581a(list);
        this.f14930d = list;
        this.f14931e = str2;
        this.f14932f = z;
        this.f14933g = bArr;
        this.f14934h = bArr2;
        this.f14935i = bArr3;
        this.f14936j = bArr4;
        this.f14937k = list3;
        this.f14938l = list3 != null ? true : z2;
        this.f14939m = eib;
        this.f14946t = itc;
        this.f14940n = egz;
        this.f14941o = egy;
        this.f14942p = bool;
        this.f14945s = ipn;
        this.f14944r = sek;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* renamed from: a */
    private final bqme m10420a(String str, List list) {
        bqmd bqmd = (bqmd) bqme.f141196d.mo74144da();
        if (bqmd.f164950c) {
            bqmd.mo74035c();
            bqmd.f164950c = false;
        }
        str.getClass();
        ((bqme) bqmd.f164949b).f141198a = str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bqmd.mo69278a(bxtx.m123261a(((ehl) list.get(i)).f14976a));
        }
        eib eib = this.f14939m;
        String str2 = this.f14931e;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        ipr.f21528b.mo25412b("Retrieving keyMetadata for keyName=%s", str);
        ipr ipr = (ipr) eib;
        ipp a = ipp.m15839a(ipr.f21529a);
        byte[] bArr = null;
        bArr = null;
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = a.getReadableDatabase();
            try {
                Cursor a2 = ipr.m15845a(readableDatabase, "metadata", new String[]{"client_metadata"}, "identifier = ? AND account = ?", new String[]{ipr.m15850b(str), str2});
                if (a2 != null) {
                    try {
                        if (a2.moveToFirst()) {
                            bArr = ipr.m15849a(a2);
                            ipr.mo13230b(a2);
                            a.close();
                            if (bArr != null) {
                                bxtx a3 = bxtx.m123261a(bArr);
                                if (bqmd.f164950c) {
                                    bqmd.mo74035c();
                                    bqmd.f164950c = false;
                                }
                                a3.getClass();
                                ((bqme) bqmd.f164949b).f141200c = a3;
                            }
                            return (bqme) bqmd.mo74062i();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                    }
                }
                ipr.f21528b.mo25416d("No keyMetadata found for keyName=%s", str);
                ipr.mo13230b(a2);
                a.close();
                if (bArr != null) {
                }
                return (bqme) bqmd.mo74062i();
            } catch (Throwable th2) {
                th = th2;
                ipr.mo13230b(cursor);
                a.close();
                throw th;
            }
        } catch (SQLiteException e) {
            ipr.f21528b.mo25417e("Failed to retrieve keyMetadata", e, new Object[0]);
        }
    }

    /* renamed from: a */
    private static final void m10421a(ehg ehg, String str, bxtx bxtx) {
        if (!bxtx.mo73779j()) {
            ehg.mo10146a(str).f14984d = bxtx.mo73780k();
        }
    }

    /* renamed from: a */
    private static final boolean m10422a(ehb ehb) {
        return ehc.m10411a(ehb.mo10128d()).equals(ehc.ASYMMETRIC_KEY) && ((ehr) ehb).f14997b == null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:221:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x06f3 A[SYNTHETIC] */
    /* renamed from: a */
    public final ehi mo10142a() {
        char c;
        boolean z;
        ipp a;
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        chtv chtv;
        boolean z3;
        List list;
        int i;
        byte[] bArr;
        bqlu bqlu;
        byte[] bArr2;
        xlo xlo;
        int i2;
        bqmb bqmb;
        int i3;
        int i4;
        bqmb bqmb2;
        int i5;
        chtv chtv2;
        ehm ehm;
        ehg ehg = new ehg();
        List<ehm> a2 = this.f14940n.f14893a.mo10156a(this.f14931e);
        ArrayList arrayList = new ArrayList();
        for (ehm ehm2 : a2) {
            if (egz.m10394a(ehm2)) {
                arrayList.add(ehm2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f14930d.iterator();
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String str2 = this.f14931e;
            int size = arrayList.size();
            while (true) {
                if (i6 >= size) {
                    ehm = null;
                    break;
                }
                ehm ehm3 = (ehm) arrayList.get(i6);
                if (ehm3.f14978a.equals(str) && str2.equals(ehm3.f14979b)) {
                    ehm = ehm3;
                    break;
                }
                i6++;
            }
            if (!egz.m10394a(ehm)) {
                arrayList2.add(str);
            }
        }
        this.f14930d = arrayList2;
        if (arrayList2.isEmpty()) {
            if (!this.f14942p.booleanValue()) {
                ehg.f14948a = ehh.NO_SYNC_REQUIRED;
                return ehg.mo10145a();
            } else if (arrayList.isEmpty()) {
                throw new ehf("No key already present and no new keys requested.", ehh.BAD_CLIENT_STATE);
            }
        }
        bqmc bqmc = (bqmc) bqmf.f141201f.mo74144da();
        String str3 = this.f14928b;
        if (bqmc.f164950c) {
            bqmc.mo74035c();
            bqmc.f164950c = false;
        }
        bqmf bqmf = (bqmf) bqmc.f164949b;
        str3.getClass();
        bqmf.f141203a = str3;
        BuildConfig.VERSION_NAME.getClass();
        bqmf.f141204b = BuildConfig.VERSION_NAME;
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ehm ehm4 = (ehm) arrayList.get(i7);
            bqmc.mo69277a(m10420a(ehm4.f14978a, ehm4.f14980c));
        }
        for (String str4 : this.f14930d) {
            if (this.f14938l) {
                bmxy.m108581a(this.f14937k);
                bqmd bqmd = (bqmd) bqme.f141196d.mo74144da();
                if (bqmd.f164950c) {
                    bqmd.mo74035c();
                    bqmd.f164950c = false;
                }
                str4.getClass();
                ((bqme) bqmd.f164949b).f141198a = str4;
                List list2 = this.f14937k;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    bqmd.mo69278a(bxtx.m123261a((byte[]) list2.get(i8)));
                }
                bqmc.mo69277a((bqme) bqmd.mo74062i());
            } else if (this.f14932f) {
                bqmd bqmd2 = (bqmd) bqme.f141196d.mo74144da();
                if (bqmd2.f164950c) {
                    bqmd2.mo74035c();
                    bqmd2.f164950c = false;
                }
                str4.getClass();
                ((bqme) bqmd2.f164949b).f141198a = str4;
                bqmc.mo69277a((bqme) bqmd2.mo74062i());
            } else {
                bqmc.mo69277a(m10420a(str4, new ArrayList()));
            }
        }
        bxvd da = bqlr.f141155c.mo74144da();
        bqlq bqlq = this.f14929c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqlr) da.f164949b).f141157a = bqlq.mo3214a();
        if (bqmc.f164950c) {
            bqmc.mo74035c();
            bqmc.f164950c = false;
        }
        bqlr bqlr = (bqlr) da.mo74062i();
        bqlr.getClass();
        ((bqmf) bqmc.f164949b).f141206d = bqlr;
        byte[] bArr3 = this.f14933g;
        if (bArr3 != null) {
            bxtx a3 = bxtx.m123261a(bArr3);
            if (bqmc.f164950c) {
                bqmc.mo74035c();
                bqmc.f164950c = false;
            }
            a3.getClass();
            ((bqmf) bqmc.f164949b).f141207e = a3;
        }
        bqmf bqmf2 = (bqmf) bqmc.mo74062i();
        this.f14944r.mo25414c("Performing SyncKeysRequest with %d keys.", Integer.valueOf(bqmf2.f141205c.size()));
        try {
            itc itc = this.f14946t;
            itc.f21656a.mo13321a(1, -1);
            try {
                bqly d = itc.f21657b.mo13267d();
                try {
                    chqp chqp = d.f190402a;
                    chtv chtv3 = bqlz.f141181a;
                    if (chtv3 == null) {
                        synchronized (bqlz.class) {
                            chtv2 = bqlz.f141181a;
                            if (chtv2 == null) {
                                chts a4 = chtv.m149565a();
                                a4.f189140c = chtu.UNARY;
                                a4.f189141d = chtv.m149567a("google.cryptauth.enrollment.v1.Enrollment", "SyncKeys");
                                a4.mo85659b();
                                a4.f189138a = ciie.m150370a(bqmf.f141201f);
                                a4.f189139b = ciie.m150370a(bqml.f141226f);
                                chtv2 = a4.mo85658a();
                                bqlz.f141181a = chtv2;
                            }
                        }
                        chtv3 = chtv2;
                    }
                    bqml bqml = (bqml) ciiq.m150394a(chqp, chtv3, d.f190403b, bqmf2);
                    itc.f21656a.f21624a = new BigInteger(bqml.f141228a.mo73780k()).longValue();
                    this.f14944r.mo25414c("SyncKeysRequest successfully completed", new Object[0]);
                    int i9 = bqml.f141232e;
                    if (i9 != 0) {
                        c = i9 != 1 ? (char) 0 : 3;
                    } else {
                        c = 2;
                    }
                    if (c != 0 && c == 3) {
                        egy egy = this.f14941o;
                        String str5 = this.f14931e;
                        bqlp bqlp = bqml.f141231d;
                        if (bqlp == null) {
                            bqlp = bqlp.f141129f;
                        }
                        egy.mo10119a(str5, bqlp);
                        throw new ehf("Server overloaded", ehh.SERVER_OVERLOADED);
                    } else if (bqml.f141230c.size() != bqmf2.f141205c.size()) {
                        this.f14944r.mo25418e("Mismatch: Actual syncSingleKeyResponse=%d, expected syncSingleKeyResponse=%d", Integer.valueOf(bqml.f141230c.size()), Integer.valueOf(bqmf2.f141205c.size()));
                        throw new ehf("Mismatch between expected SyncSingleKeyResponsesCount and actual SyncSingleKeyResponsesCount.", ehh.ILLEGAL_SERVER_STATE);
                    } else if (bqml != null) {
                        ehj ehj = new ehj();
                        ehj.f14970a = bqml.f141228a.mo73780k();
                        bqlp bqlp2 = bqml.f141231d;
                        if (bqlp2 == null || bqlp2.f141131a == 0) {
                            throw new ehf("No clientDirective in response.", ehh.ILLEGAL_SERVER_STATE);
                        }
                        ehj.f14972c = bqml.f141229b.mo73780k();
                        ehj.f14971b = ehv.m10461a();
                        ehk a5 = ehj.mo10149a();
                        bqlp bqlp3 = bqml.f141231d;
                        if (bqlp3 == null) {
                            bqlp3 = bqlp.f141129f;
                        }
                        long j = bqlp3.f141131a;
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            ehm ehm5 = (ehm) arrayList.get(i10);
                            bqmk bqmk = (bqmk) bqml.f141230c.get(i10);
                            bqlp bqlp4 = bqml.f141231d;
                            if (bqlp4 == null) {
                                bqlp4 = bqlp.f141129f;
                            }
                            long j2 = bqlp4.f141131a;
                            String str6 = ehm5.f14978a;
                            bqmb a6 = bqmb.m112990a(bqmk.f141220d);
                            if (a6 == null) {
                                a6 = bqmb.UNRECOGNIZED;
                            }
                            ehg.mo10147a(str6, a6);
                            egz egz = this.f14940n;
                            bxvv<bqmh> bxvv = new bxvv(bqmk.f141218a, bqmk.f141215b);
                            if (bxvv.size() == ehm5.f14980c.size()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (bqmh bqmh : bxvv) {
                                    arrayList3.add(ehp.m10433a(bqmh));
                                }
                                egz.f14893a.mo10157a(ehm5, arrayList3);
                                String str7 = ehm5.f14978a;
                                int a7 = bqmi.m113000a(bqmk.f141219c);
                                if (a7 != 0) {
                                    i4 = a7;
                                } else {
                                    i4 = 1;
                                }
                                bqmb a8 = bqmb.m112990a(bqmk.f141220d);
                                if (a8 != null) {
                                    bqmb2 = a8;
                                } else {
                                    bqmb2 = bqmb.UNRECOGNIZED;
                                }
                                int a9 = bqmj.m113001a(bqmk.f141222f);
                                if (a9 != 0) {
                                    i5 = a9;
                                } else {
                                    i5 = 1;
                                }
                                mo10143a(str7, i4, bqmb2, j2, a5, i5, bqmk.f141223g, bqmk.f141224h, bqmk.f141225i);
                                m10421a(ehg, ((ehm) arrayList.get(i10)).f14978a, ((bqmk) bqml.f141230c.get(i10)).f141221e);
                                i10++;
                                bqml = bqml;
                                ehj = ehj;
                                j = j;
                            } else {
                                String str8 = ehm5.f14978a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 65);
                                sb.append("Number of keyHandles for key ");
                                sb.append(str8);
                                sb.append(" doesn't match number of keyActions.");
                                throw new ehf(sb.toString(), ehh.ILLEGAL_SERVER_STATE);
                            }
                        }
                        ehj ehj2 = ehj;
                        long j3 = j;
                        bqml bqml2 = bqml;
                        int size4 = arrayList.size();
                        while (size4 < bqml2.f141230c.size()) {
                            bqmk bqmk2 = (bqmk) bqml2.f141230c.get(size4);
                            String str9 = (String) this.f14930d.get(size4 - arrayList.size());
                            int a10 = bqmi.m113000a(bqmk2.f141219c);
                            if (a10 != 0) {
                                i2 = a10;
                            } else {
                                i2 = 1;
                            }
                            bqmb a11 = bqmb.m112990a(bqmk2.f141220d);
                            if (a11 != null) {
                                bqmb = a11;
                            } else {
                                bqmb = bqmb.UNRECOGNIZED;
                            }
                            int a12 = bqmj.m113001a(bqmk2.f141222f);
                            if (a12 != 0) {
                                i3 = a12;
                            } else {
                                i3 = 1;
                            }
                            ArrayList arrayList4 = arrayList;
                            String str10 = str9;
                            bqml bqml3 = bqml2;
                            mo10143a(str9, i2, bqmb, j3, a5, i3, bqmk2.f141223g, bqmk2.f141224h, bqmk2.f141225i);
                            m10421a(ehg, str10, bqmk2.f141221e);
                            bqmb a13 = bqmb.m112990a(bqmk2.f141220d);
                            if (a13 == null) {
                                a13 = bqmb.UNRECOGNIZED;
                            }
                            ehg.mo10147a(str10, a13);
                            size4++;
                            bqml2 = bqml3;
                            arrayList = arrayList4;
                        }
                        egy egy2 = this.f14941o;
                        String str11 = this.f14931e;
                        bqlp bqlp5 = bqml2.f141231d;
                        if (bqlp5 == null) {
                            bqlp5 = bqlp.f141129f;
                        }
                        egy2.mo10119a(str11, bqlp5);
                        if (!this.f14940n.f14894b.isEmpty()) {
                            ehk a14 = ehj2.mo10149a();
                            bxvd da2 = bqlu.f141170d.mo74144da();
                            bxtx a15 = bxtx.m123261a(a14.f14973a);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                z = false;
                                da2.f164950c = false;
                            } else {
                                z = false;
                            }
                            a15.getClass();
                            ((bqlu) da2.f164949b).f141172a = a15;
                            List list3 = this.f14940n.f14894b;
                            int size5 = list3.size();
                            boolean z4 = false;
                            int i11 = 0;
                            while (i11 < size5) {
                                ehb ehb = (ehb) list3.get(i11);
                                if (!ehc.m10411a(ehb.mo10128d()).equals(ehc.SYMMETRIC_KEY)) {
                                    z3 = z4;
                                } else {
                                    z3 = true;
                                }
                                bxvd da3 = bqlt.f141163f.mo74144da();
                                String a16 = ehb.mo10125a();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = z;
                                }
                                a16.getClass();
                                ((bqlt) da3.f164949b).f141165a = a16;
                                bxtx a17 = bxtx.m123261a(ehb.mo10126b());
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = z;
                                }
                                a17.getClass();
                                ((bqlt) da3.f164949b).f141166b = a17;
                                if (!this.f14943q.contains(ehb.mo10125a()) || !this.f14932f) {
                                    list = list3;
                                    i = 1;
                                    if (ehb.mo10127c() != null) {
                                        bxtx a18 = bxtx.m123261a(ehb.mo10127c());
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        a18.getClass();
                                        ((bqlt) da3.f164949b).f141167c = a18;
                                    }
                                } else {
                                    bmxy.m108581a(this.f14945s);
                                    ipn ipn = this.f14945s;
                                    byte[] bArr4 = this.f14936j;
                                    byte[] bArr5 = a14.f14973a;
                                    sdo.m34959a(bArr4);
                                    sdo.m34959a(bArr5);
                                    try {
                                        xwu xwu = (xwu) bxvk.m124014a(xwu.f53308e, bArr4);
                                        xlw xlw = new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(bArr5), xwu.f53312c, ipn.f21516d.getPackageName(), null);
                                        list = list3;
                                        xlq xlq = new xlq(xwu.f53310a.mo73780k(), (byte) 64, xwu.f53311b, new xln(new byte[16], ipn.f21513a, ipn.f21514b));
                                        try {
                                            ipn.f21515c.mo29681a(xlq.mo29917a(), xlw.mo29927c());
                                            xlo = new xlo(xlq.mo29917a(), "android-safetynet", ipn.f21515c.mo29680a().mo29915a().mo74444c());
                                        } catch (bypm | bypr | xma e) {
                                            ipn.f21517e.mo25418e("Unable to construct SafetyNet attestation statement", new Object[0]);
                                            xlo = null;
                                        }
                                        if (xlo != null) {
                                            bxvd da4 = bsnr.f146322d.mo74144da();
                                            bxtx a19 = bxtx.m123261a(xlw.mo29926b());
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            a19.getClass();
                                            ((bsnr) da4.f164949b).f146324a = a19;
                                            try {
                                                bxtx a20 = bxtx.m123261a(xlo.mo29912a());
                                                if (da4.f164950c) {
                                                    da4.mo74035c();
                                                    da4.f164950c = false;
                                                }
                                                a20.getClass();
                                                ((bsnr) da4.f164949b).f146325b = a20;
                                                if (!xwu.f53313d.mo73779j()) {
                                                    bxtx bxtx = xwu.f53313d;
                                                    if (da4.f164950c) {
                                                        da4.mo74035c();
                                                        da4.f164950c = false;
                                                    }
                                                    bxtx.getClass();
                                                    ((bsnr) da4.f164949b).f146326c = bxtx;
                                                }
                                                bArr2 = ((bsnr) da4.mo74062i()).mo73642k();
                                                i = 1;
                                            } catch (bypm | bypq | bypr e2) {
                                                i = 1;
                                                ipn.f21517e.mo25418e("Error encoding attestation object", e2);
                                                bArr2 = null;
                                                if (bArr2 != null) {
                                                }
                                                if (!m10422a(ehb)) {
                                                }
                                                if (bArr != null) {
                                                }
                                                if (m10422a(ehb)) {
                                                }
                                                if (da2.f164950c) {
                                                }
                                                bqlu = (bqlu) da2.f164949b;
                                                bqlt bqlt = (bqlt) da3.mo74062i();
                                                bqlt.getClass();
                                                if (!bqlu.f141174c.mo73666a()) {
                                                }
                                                bqlu.f141174c.add(bqlt);
                                                i11++;
                                                z4 = z3;
                                                list3 = list;
                                                z = false;
                                            }
                                        } else {
                                            i = 1;
                                            bArr2 = null;
                                        }
                                    } catch (bxwf e3) {
                                        list = list3;
                                        i = 1;
                                        ipn.f21517e.mo25418e("Unable to parse the FidoAppKeyMetedata protocol buffer", e3);
                                        bArr2 = null;
                                        if (bArr2 != null) {
                                        }
                                        if (!m10422a(ehb)) {
                                        }
                                        if (bArr != null) {
                                        }
                                        if (m10422a(ehb)) {
                                        }
                                        if (da2.f164950c) {
                                        }
                                        bqlu = (bqlu) da2.f164949b;
                                        bqlt bqlt2 = (bqlt) da3.mo74062i();
                                        bqlt2.getClass();
                                        if (!bqlu.f141174c.mo73666a()) {
                                        }
                                        bqlu.f141174c.add(bqlt2);
                                        i11++;
                                        z4 = z3;
                                        list3 = list;
                                        z = false;
                                    }
                                    if (bArr2 != null) {
                                        bxtx a21 = bxtx.m123261a(bArr2);
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        a21.getClass();
                                        ((bqlt) da3.f164949b).f141167c = a21;
                                    }
                                }
                                if (!m10422a(ehb)) {
                                    bArr = mo10144a(ehb, a14.f14973a);
                                } else {
                                    bArr = null;
                                }
                                if (bArr != null) {
                                    bxtx a22 = bxtx.m123261a(bArr);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    a22.getClass();
                                    ((bqlt) da3.f164949b).f141168d = a22;
                                }
                                if (m10422a(ehb)) {
                                    bxvd da5 = bqls.f141159c.mo74144da();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    ((bqls) da5.f164949b).f141161a = i;
                                    bxtx a23 = bxtx.m123261a(egx.m10388c(ehb.mo10126b()));
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    a23.getClass();
                                    ((bqls) da5.f164949b).f141162b = a23;
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bqls bqls = (bqls) da5.mo74062i();
                                    bqls.getClass();
                                    ((bqlt) da3.f164949b).f141169e = bqls;
                                }
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bqlu = (bqlu) da2.f164949b;
                                bqlt bqlt22 = (bqlt) da3.mo74062i();
                                bqlt22.getClass();
                                if (!bqlu.f141174c.mo73666a()) {
                                    bqlu.f141174c = bxvk.m124021a(bqlu.f141174c);
                                }
                                bqlu.f141174c.add(bqlt22);
                                i11++;
                                z4 = z3;
                                list3 = list;
                                z = false;
                            }
                            if (z4) {
                                bxtx a24 = bxtx.m123261a(ehv.m10466a(a14.f14974b.getPublic()));
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                a24.getClass();
                                ((bqlu) da2.f164949b).f141173b = a24;
                            }
                            this.f14944r.mo25414c("Performing EnrollKeysRequest for %d keys.", Integer.valueOf(this.f14940n.f14894b.size()));
                            try {
                                itc itc2 = this.f14946t;
                                bqlu bqlu2 = (bqlu) da2.mo74062i();
                                try {
                                    bqly d2 = itc2.f21657b.mo13267d();
                                    try {
                                        chqp chqp2 = d2.f190402a;
                                        chtv chtv4 = bqlz.f141182b;
                                        if (chtv4 == null) {
                                            synchronized (bqlz.class) {
                                                chtv = bqlz.f141182b;
                                                if (chtv == null) {
                                                    chts a25 = chtv.m149565a();
                                                    a25.f189140c = chtu.UNARY;
                                                    a25.f189141d = chtv.m149567a("google.cryptauth.enrollment.v1.Enrollment", "EnrollKeys");
                                                    a25.mo85659b();
                                                    a25.f189138a = ciie.m150370a(bqlu.f141170d);
                                                    a25.f189139b = ciie.m150370a(bqlw.f141178b);
                                                    chtv = a25.mo85658a();
                                                    bqlz.f141182b = chtv;
                                                }
                                            }
                                            chtv4 = chtv;
                                        }
                                        bqlw bqlw = (bqlw) ciiq.m150394a(chqp2, chtv4, d2.f190403b, bqlu2);
                                        this.f14944r.mo25414c("EnrollKeysRequest successfully completed.", new Object[0]);
                                        if (bqlw != null) {
                                            this.f14944r.mo25414c("Enrollment successful.", new Object[0]);
                                            ehg.f14948a = ehh.NEW_ACTIVE_KEY_ENROLLED;
                                            if (bqlw.f141180a.size() != 0) {
                                                List list4 = this.f14940n.f14894b;
                                                if (list4.size() == bqlw.f141180a.size()) {
                                                    for (int i12 = 0; i12 < list4.size(); i12++) {
                                                        ehb ehb2 = (ehb) list4.get(i12);
                                                        bqlv bqlv = (bqlv) bqlw.f141180a.get(i12);
                                                        if (bqlv.f141177a.size() != 0) {
                                                            bxwc bxwc = ((bqlo) bqlv.f141177a.get(bqlv.f141177a.size() - 1)).f141128a;
                                                            int size6 = bxwc.size();
                                                            for (int i13 = 0; i13 < size6; i13++) {
                                                                bqln bqln = (bqln) bxwc.get(i13);
                                                                String a26 = ehb2.mo10125a();
                                                                eha eha = new eha(bqln.f141123a, bqln.f141124b, bqln.f141125c.mo73780k());
                                                                ehn a27 = ehg.mo10146a(a26);
                                                                bmxy.m108581a(eha);
                                                                a27.f14981a.add(eha);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    throw new ehf("Number of EnrollSingleKeyResponse should match number of keys in escrow", ehh.ILLEGAL_SERVER_STATE);
                                                }
                                            }
                                            try {
                                                egz egz2 = this.f14940n;
                                                ArrayList<ehb> arrayList5 = new ArrayList();
                                                for (ehb ehb3 : egz2.f14894b) {
                                                    if (!ehb3.mo10128d().equals(bqmb.CUSTOM)) {
                                                        arrayList5.add(ehb3);
                                                    }
                                                }
                                                eia eia = egz2.f14893a;
                                                ipo.f21519c.mo25412b("Adding %d keys to database.", Integer.valueOf(arrayList5.size()));
                                                if (!arrayList5.isEmpty()) {
                                                    a = ipp.m15839a(((ipo) eia).f21520b);
                                                    if (!ccfj.m129447c()) {
                                                        sQLiteDatabase = a.getWritableDatabase();
                                                    } else {
                                                        sQLiteDatabase = a.getWritableDatabase();
                                                    }
                                                    sQLiteDatabase.beginTransaction();
                                                    for (ehb ehb4 : arrayList5) {
                                                        ehc a28 = ehc.m10411a(ehb4.mo10128d());
                                                        if (ehc.UNKNOWN_KEY_TYPE.equals(a28)) {
                                                            ipo.f21519c.mo25416d("Unknown key type for %s. Not adding to database.", ehb4.mo10128d().name());
                                                        } else {
                                                            Cursor a29 = ipo.m15816a(sQLiteDatabase, "keys", null, "key_handle = ? AND account = ?", new String[]{sqd.m35972d(ehb4.mo10126b()), ehb4.mo10129e()});
                                                            if (a29 == null || !a29.moveToFirst() || a29.getCount() == 0) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            ipo.m15831m(a29);
                                                            if (z2) {
                                                                ipo.f21519c.mo25412b("Key already present in database. Not adding it.", new Object[0]);
                                                            } else {
                                                                if (ehb4.mo10132h().equals(ehp.ACTIVE_KEY)) {
                                                                    ipo.f21519c.mo25412b("markAllPreviousInstancesAsInactive for key=%s and account=%s", ehb4.mo10125a(), ehb4.mo10129e());
                                                                    ContentValues contentValues = new ContentValues();
                                                                    ipo.m15818a(contentValues, ehp.INACTIVE_KEY);
                                                                    ipo.f21519c.mo25412b("Successfully marked %d keys as INACTIVE", Integer.valueOf(sQLiteDatabase.update("keys", contentValues, "key_name = ? AND account = ?", new String[]{ehb4.mo10125a(), ehb4.mo10129e()})));
                                                                }
                                                                ContentValues contentValues2 = new ContentValues();
                                                                if (ehc.SYMMETRIC_KEY.equals(a28)) {
                                                                    contentValues2.put("master_key", sqd.m35972d(((eht) ehb4).f15015c));
                                                                } else if (ehc.ASYMMETRIC_KEY.equals(a28)) {
                                                                    ehr ehr = (ehr) ehb4;
                                                                    contentValues2.put("private_key", sqd.m35972d(ehr.f14997b));
                                                                    contentValues2.put("public_key", sqd.m35972d(ehr.f14996a));
                                                                }
                                                                contentValues2.put("key_handle", sqd.m35972d(ehb4.mo10126b()));
                                                                contentValues2.put("exportable", Integer.valueOf(ehb4.mo10133i()));
                                                                contentValues2.put("key_name", ehb4.mo10125a());
                                                                contentValues2.put("key_form", Integer.valueOf(a28.f14909e));
                                                                contentValues2.put("key_type", ehb4.mo10128d().name());
                                                                ipo.m15818a(contentValues2, ehb4.mo10132h());
                                                                contentValues2.put("account", ehb4.mo10129e());
                                                                contentValues2.put("creation_time", Long.valueOf(ehb4.mo10130f()));
                                                                contentValues2.put("expiration_time", Long.valueOf(ehb4.mo10131g()));
                                                                if (sQLiteDatabase.insert("keys", null, contentValues2) < 0) {
                                                                    String a30 = ehb4.mo10125a();
                                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(a30).length() + 35);
                                                                    sb2.append("Failed to add key=");
                                                                    sb2.append(a30);
                                                                    sb2.append(" to the database.");
                                                                    throw new ehz(sb2.toString());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    a.close();
                                                }
                                                egz2.f14894b.clear();
                                            } catch (SQLiteException e4) {
                                                throw new ehz(e4);
                                            } catch (ehz e5) {
                                                throw new ehf(ehh.KEY_INSERTION_FAILED, "Failed to write keys to database.", e5);
                                            } catch (Throwable th) {
                                                sQLiteDatabase.endTransaction();
                                                a.close();
                                                throw th;
                                            }
                                        } else {
                                            throw new ehf("Failed to enroll keys.", ehh.TEMPORARY_CONNECTION_FAILURE);
                                        }
                                    } catch (chux e6) {
                                        throw new ehq("Failed to make EnrollKeysRequest", e6, itc.m16088a(e6.f189238a.f189233s));
                                    }
                                } catch (gid e7) {
                                    e = e7;
                                    throw new ehq("failed to create stub", e, ehh.AUTH_ERROR);
                                } catch (IOException e8) {
                                    e = e8;
                                    throw new ehq("failed to create stub", e, ehh.AUTH_ERROR);
                                }
                            } catch (ehq e9) {
                                ehh ehh = e9.f14995a;
                                if (ehh.equals(ehh.INVALID_REQUEST_ERROR)) {
                                    throw new ehf(e9.getCause(), ehh);
                                }
                                throw new ehf(e9, ehh);
                            }
                        } else {
                            this.f14944r.mo25414c("Not performing EnrollKeys", new Object[0]);
                            ehg.f14948a = ehh.NO_NEW_KEY_NEEDED;
                        }
                        return ehg.mo10145a();
                    } else {
                        throw new ehf("Failed to sync keys.", ehh.TEMPORARY_CONNECTION_FAILURE);
                    }
                } catch (chux e10) {
                    throw new ehq("Failed to make SyncKeysRequest", e10, itc.m16088a(e10.f189238a.f189233s));
                }
            } catch (gid e11) {
                e = e11;
                throw new ehq("failed to create stub", e, ehh.AUTH_ERROR);
            } catch (IOException e12) {
                e = e12;
                throw new ehq("failed to create stub", e, ehh.AUTH_ERROR);
            }
        } catch (ehq e13) {
            ehh ehh2 = e13.f14995a;
            if (ehh2.equals(ehh.INVALID_REQUEST_ERROR)) {
                throw new ehf(e13.getCause(), ehh2);
            }
            throw new ehf(e13, ehh2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10143a(String str, int i, bqmb bqmb, long j, ehk ehk, int i2, boolean z, boolean z2, int i3) {
        char c;
        egz egz;
        KeyPair keyPair;
        boolean z3;
        SQLiteDatabase sQLiteDatabase;
        String str2 = str;
        int i4 = i2;
        if (i == 2) {
            return;
        }
        if (!bqmb.CUSTOM.equals(bqmb)) {
            egz egz2 = this.f14940n;
            String str3 = this.f14931e;
            int ordinal = ehc.m10411a(bqmb).ordinal();
            Object obj = null;
            if (ordinal == 0) {
                if (str2.equals("PublicKey")) {
                    eia eia = egz2.f14893a;
                    ipo.f21519c.mo25412b("getAuthzenAsymmetricKeyPair", new Object[0]);
                    ipp a = ipp.m15839a(((ipo) eia).f21520b);
                    if (ccfj.m129447c()) {
                        try {
                            sQLiteDatabase = a.getWritableDatabase();
                        } catch (SQLiteException e) {
                        }
                    } else {
                        sQLiteDatabase = a.getWritableDatabase();
                    }
                    sQLiteDatabase.beginTransaction();
                    try {
                        Object a2 = ((ipo) eia).mo13217a(sQLiteDatabase, str3, "key_name = ? AND account = ?", new String[]{"PublicKey", str3});
                        if (a2 == null) {
                            Object a3 = ((ipo) eia).mo13217a(sQLiteDatabase, str3, "key_name = ?", new String[]{"PublicKey"});
                            sQLiteDatabase.endTransaction();
                            a.close();
                            obj = a3;
                        } else {
                            ipo.f21519c.mo25412b("Found existing authzen keypair for account", new Object[0]);
                            sQLiteDatabase.endTransaction();
                            a.close();
                            obj = a2;
                        }
                        if (obj != null) {
                            egz = egz2;
                            c = 0;
                        }
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        a.close();
                        throw th;
                    }
                }
                byte[] a4 = egz2.mo10121a(str2);
                if (ccfg.m129431b()) {
                    if (i4 != 5) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (i4 == 5 || i4 == 4) {
                        keyPair = egx.m10383a(a4, z3, ehk.f14973a, z, z2, i3);
                        long currentTimeMillis = System.currentTimeMillis();
                        c = 0;
                        egz = egz2;
                        obj = new ehr(str, str3, a4, bqmb, ehp.ACTIVE_KEY, 1, keyPair, currentTimeMillis, currentTimeMillis + j);
                    }
                }
                if (bqmb.ordinal() == 4) {
                    keyPair = ehv.m10470b();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    c = 0;
                    egz = egz2;
                    obj = new ehr(str, str3, a4, bqmb, ehp.ACTIVE_KEY, 1, keyPair, currentTimeMillis2, currentTimeMillis2 + j);
                } else {
                    egz2.f14895c.mo25418e("keyType %s not supported yet.", bqmb.toString());
                    throw new ehf("Unsupported server action.", ehh.UNSUPPORTED_ACTION);
                }
            } else if (ordinal != 1) {
                egz = egz2;
                c = 0;
            } else {
                obj = egz2.mo10120a(str, str3, bqmb, j, ehk);
                egz = egz2;
                c = 0;
            }
            if (obj == null) {
                sek sek = egz.f14895c;
                Object[] objArr = new Object[2];
                objArr[c] = bqmb.toString();
                objArr[1] = str2;
                sek.mo25416d("Invalid keyType=%s for keyName=%s.", objArr);
                return;
            }
            egz.f14894b.add(obj);
        } else if (!this.f14938l) {
            byte[] bArr = this.f14934h;
            if (bArr != null) {
                this.f14940n.f14894b.add(new ehs(str, this.f14931e, bArr, this.f14935i, j));
                return;
            }
            throw new ehf("Missing CUSTOM Key handle.", ehh.MISSING_CUSTOM_DATA);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo10144a(ehb ehb, byte[] bArr) {
        ehc a = ehc.m10411a(ehb.mo10128d());
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            try {
                return ehv.m10465a(((ehr) ehb).f14998c, this.f14927a, bArr);
            } catch (InvalidKeyException | SignatureException e) {
                throw new ehf(e, ehh.CRYPTOGRAPHIC_KEY_ERROR);
            }
        } else if (ordinal == 1) {
            return ehv.m10467a(ehb.mo10127c(), ehb.mo10125a(), egz.m10392a(ehb.mo10128d()), bArr);
        } else if (ordinal == 2) {
            return null;
        } else {
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Unsupported keyType ");
            sb.append(valueOf);
            sb.append("while performing keyProof");
            throw new ehf(sb.toString(), ehh.UNSUPPORTED_ACTION);
        }
    }
}

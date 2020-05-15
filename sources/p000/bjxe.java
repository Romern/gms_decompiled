package p000;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.IsoDep;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxe {

    /* renamed from: a */
    private static final int f123562a = ((Integer) bjwe.f123490k.mo54082a()).intValue();

    /* renamed from: a */
    public static bjws m104832a(Intent intent) {
        bjxh a;
        IsoDep isoDep = IsoDep.get((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
        if (isoDep != null) {
            try {
                isoDep.connect();
                isoDep.setTimeout(f123562a);
                int i = 0;
                for (String str : bjxb.f123552b) {
                    bjxf bjxf = new bjxf(m104835a(isoDep, bjxb.m104827a(str).f123561a));
                    bjws bjws = null;
                    if (bjxb.m104828a(bjxf, bjxf.f123563a) && (a = bjxj.m104840a(bjxi.m104836a(bjxf), bjxj.f123576e)) != null) {
                        bjws = m104834a(isoDep, bjxj.m104841a(a));
                    }
                    if (bjws != null) {
                        return bjws;
                    }
                }
                String[] strArr = bjxb.f123551a;
                int length = strArr.length;
                while (i < length) {
                    bjws a2 = m104834a(isoDep, strArr[i]);
                    if (a2 == null) {
                        i++;
                    } else {
                        isoDep.close();
                        return a2;
                    }
                }
                isoDep.close();
                throw new bjxk();
            } finally {
                isoDep.close();
            }
        } else {
            throw new bjxm();
        }
    }

    /* renamed from: a */
    private static bjws m104833a(IsoDep isoDep, byte b, byte b2) {
        bjws c;
        bjxf bjxf = new bjxf(m104835a(isoDep, bjxb.m104826a(b, b2, (byte) 0).f123561a));
        if (bjxb.m104828a(bjxf, bjxf.f123564b)) {
            bjxf = new bjxf(m104835a(isoDep, bjxb.m104826a(b, b2, bjxf.f123567e).f123561a));
        }
        if (!bjxb.m104828a(bjxf, bjxf.f123563a) || (c = bjxj.m104845c(bjxi.m104836a(bjxf))) == null) {
            return null;
        }
        return c;
    }

    /* renamed from: a */
    private static bjws m104834a(IsoDep isoDep, String str) {
        boolean z;
        bjws bjws;
        byte b;
        bjxf bjxf = new bjxf(m104835a(isoDep, bjxb.m104827a(str).f123561a));
        if (bjxb.m104828a(bjxf, bjxf.f123563a)) {
            bjxh a = bjxi.m104836a(bjxf);
            bjxh a2 = bjxj.m104840a(a, bjxj.f123577f);
            bjxh a3 = bjxj.m104840a(a, bjxj.f123575d);
            if (a3 == null || !bjxj.m104841a(a3).toLowerCase(Locale.US).startsWith("visacard")) {
                z = false;
            } else {
                z = true;
            }
            byte[] b2 = bjxj.m104844b(a2);
            if (b2.length == 0) {
                b2 = bjve.m104687a(!z ? "8300" : "830B0000000000000000000000");
            }
            bjxc bjxc = new bjxc((byte) -88);
            bjxc.f123553a = Byte.MIN_VALUE;
            bjxc.mo65610a(b2);
            bjxc.mo65609a((byte) 0);
            byte[] a4 = bjxj.m104843a(new bjxf(m104835a(isoDep, bjxc.mo65608a().f123561a)));
            ArrayList arrayList = new ArrayList();
            int length = a4.length;
            for (int i = 0; i < length; i += 4) {
                int a5 = bjve.m104686a(a4[i]);
                byte b3 = a4[i + 1];
                byte b4 = a4[i + 2];
                byte b5 = a4[i + 3];
                arrayList.add(new bjxa(b3, b4, (byte) (a5 >> 3)));
            }
            int size = arrayList.size();
            int i2 = 0;
            loop1:
            while (true) {
                if (i2 >= size) {
                    bjws = null;
                    break;
                }
                bjxa bjxa = (bjxa) arrayList.get(i2);
                for (byte b6 = bjxa.f123548a; b6 <= bjxa.f123549b; b6 = (byte) (b6 + 1)) {
                    bjws = m104833a(isoDep, b6, bjxa.f123550c);
                    if (bjws != null) {
                        break loop1;
                    }
                }
                i2++;
            }
            if (bjws != null) {
                return bjws;
            }
            bjxh a6 = bjxj.m104840a(a, bjxj.f123578g);
            if (a6 != null) {
                int i3 = a6.f123570b[0] >> 3;
                for (byte b7 = 1; b7 <= 16; b7 = (byte) (b7 + 1)) {
                    bjws a7 = m104833a(isoDep, b7, (byte) i3);
                    if (a7 != null) {
                        return a7;
                    }
                }
                b = 1;
            } else {
                b = 1;
            }
            while (b <= 31) {
                for (byte b8 = 1; b8 <= 16; b8 = (byte) (b8 + 1)) {
                    bjws a8 = m104833a(isoDep, b8, b);
                    if (a8 != null) {
                        return a8;
                    }
                }
                b = (byte) (b + 1);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m104835a(IsoDep isoDep, byte[] bArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            return isoDep.transceive(bArr);
        } catch (TagLostException e) {
            if (SystemClock.elapsedRealtime() - elapsedRealtime >= ((long) f123562a)) {
                throw new bjxl(e);
            }
            throw e;
        }
    }
}

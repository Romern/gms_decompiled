package p000;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.walletp2p.model.Contact;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: axkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkt extends axlx {

    /* renamed from: a */
    private final Contact f96089a;

    /* renamed from: g */
    private final long f96090g;

    /* renamed from: h */
    private final String f96091h;

    /* renamed from: i */
    private final String f96092i;

    /* renamed from: j */
    private final String f96093j;

    /* renamed from: k */
    private final boolean f96094k;

    /* renamed from: l */
    private final boolean f96095l;

    /* renamed from: m */
    private final long f96096m;

    /* renamed from: n */
    private final byte[] f96097n;

    public axkt(Context context, int i, Account account, Contact contact, long j, String str, String str2, String str3, boolean z, boolean z2, long j2, byte[] bArr, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        this.f96089a = contact;
        this.f96090g = j;
        this.f96091h = str;
        this.f96092i = str2;
        this.f96093j = str3;
        this.f96094k = z;
        this.f96095l = z2;
        this.f96096m = j2;
        this.f96097n = bArr;
    }

    /* renamed from: a */
    private static final btrr[] m82681a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
            return new btrr[]{btrr.IDV_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE};
        }
        int i = Build.VERSION.SDK_INT;
        return new btrr[]{btrr.IDV_CHALLENGE, btrr.DEVICE_LOCK_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE};
    }

    /* renamed from: a */
    public final void mo53158a() {
        if (this.f96095l) {
            bxvd da = btsq.f150253c.mo74144da();
            bxvd da2 = btsz.f150308i.mo74144da();
            bxvd da3 = btsb.f150174d.mo74144da();
            long j = this.f96090g;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btsb btsb = (btsb) da3.f164949b;
            int i = btsb.f150176a | 1;
            btsb.f150176a = i;
            btsb.f150177b = j;
            String str = this.f96091h;
            str.getClass();
            btsb.f150176a = i | 2;
            btsb.f150178c = str;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsz btsz = (btsz) da2.f164949b;
            btsb btsb2 = (btsb) da3.mo74062i();
            btsb2.getClass();
            btsz.f150311b = btsb2;
            btsz.f150310a |= 1;
            String str2 = this.f96093j;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsz btsz2 = (btsz) da2.f164949b;
            str2.getClass();
            int i2 = 4 | btsz2.f150310a;
            btsz2.f150310a = i2;
            btsz2.f150313d = str2;
            btsz2.f150316g = 1;
            btsz2.f150310a = i2 | 64;
            if (!TextUtils.isEmpty(this.f96092i)) {
                String str3 = this.f96092i;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btsz btsz3 = (btsz) da2.f164949b;
                str3.getClass();
                btsz3.f150310a |= 8;
                btsz3.f150314e = str3;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsq btsq = (btsq) da.f164949b;
            btsz btsz4 = (btsz) da2.mo74062i();
            btsz4.getClass();
            btsq.f150256b = btsz4;
            btsq.f150255a |= 1;
            try {
                btsr btsr = (btsr) axmo.m82727a("b/fundstransferv2/createDraftTransaction", this.f96167c, da.mo74062i(), btsr.f150257e, this.f96170f).get();
                if ((btsr.f150259a & 1) != 0) {
                    bzvu bzvu = btsr.f150260b;
                    if (bzvu == null) {
                        bzvu = bzvu.f171552g;
                    }
                    mo53235a(bzvu);
                    return;
                }
                mo53236a(new axim(Status.f30107a, btsr.f150261c, null, null, null, null, null, null, null, btsr.f150262d));
            } catch (ExecutionException e) {
                if (e.getCause() instanceof AuthFailureError) {
                    mo53234a(16501);
                    return;
                }
                throw e;
            }
        } else if (this.f96094k) {
            bxvd da4 = bttw.f150399j.mo74144da();
            String str4 = this.f96093j;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bttw bttw = (bttw) da4.f164949b;
            str4.getClass();
            bttw.f150401a |= 1;
            bttw.f150402b = str4;
            Contact contact = this.f96089a;
            if (contact != null) {
                btsf a = axkp.m82676a(contact);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bttw bttw2 = (bttw) da4.f164949b;
                a.getClass();
                bttw2.f150403c = a;
                bttw2.f150401a |= 2;
            } else {
                bxvd da5 = btsf.f150195c.mo74144da();
                String a2 = axeo.m82423a(this.f96166b, this.f96170f);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                btsf btsf = (btsf) da5.f164949b;
                a2.getClass();
                btsf.f150197a = 4;
                btsf.f150198b = a2;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bttw bttw3 = (bttw) da4.f164949b;
                btsf btsf2 = (btsf) da5.mo74062i();
                btsf2.getClass();
                bttw3.f150403c = btsf2;
                bttw3.f150401a |= 2;
            }
            bxvd da6 = btsb.f150174d.mo74144da();
            long j2 = this.f96090g;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btsb btsb3 = (btsb) da6.f164949b;
            int i3 = btsb3.f150176a | 1;
            btsb3.f150176a = i3;
            btsb3.f150177b = j2;
            String str5 = this.f96091h;
            str5.getClass();
            btsb3.f150176a = i3 | 2;
            btsb3.f150178c = str5;
            btsb btsb4 = (btsb) da6.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bttw bttw4 = (bttw) da4.f164949b;
            btsb4.getClass();
            bttw4.f150404d = btsb4;
            int i4 = 4 | bttw4.f150401a;
            bttw4.f150401a = i4;
            String str6 = this.f96092i;
            if (str6 != null) {
                str6.getClass();
                i4 |= 8;
                bttw4.f150401a = i4;
                bttw4.f150405e = str6;
            }
            bttw4.f150406f = 1;
            int i5 = i4 | 16;
            bttw4.f150401a = i5;
            bttw4.f150407g = 1;
            bttw4.f150401a = i5 | 32;
            List<btrr> asList = Arrays.asList(m82681a(this.f96166b));
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bttw bttw5 = (bttw) da4.f164949b;
            if (!bttw5.f150408h.mo73666a()) {
                bttw5.f150408h = bxvk.m124019a(bttw5.f150408h);
            }
            for (btrr btrr : asList) {
                bttw5.f150408h.mo74153d(btrr.f150143g);
            }
            if (!(this.f96096m == 0 && this.f96097n == null)) {
                bxvd da7 = btsg.f150200e.mo74144da();
                long j3 = this.f96096m;
                if (j3 != 0) {
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    btsg btsg = (btsg) da7.f164949b;
                    btsg.f150202a |= 2;
                    btsg.f150204c = j3;
                }
                byte[] bArr = this.f96097n;
                if (bArr != null) {
                    bxtx a3 = bxtx.m123261a(bArr);
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    btsg btsg2 = (btsg) da7.f164949b;
                    a3.getClass();
                    btsg2.f150202a |= 8;
                    btsg2.f150205d = a3;
                }
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bttw bttw6 = (bttw) da4.f164949b;
                btsg btsg3 = (btsg) da7.mo74062i();
                btsg3.getClass();
                bttw6.f150409i = btsg3;
                bttw6.f150401a |= 64;
            }
            try {
                bttx bttx = (bttx) axmo.m82727a("b/fundstransferv2/createPreparedRequestTransaction", this.f96167c, da4.mo74062i(), bttx.f150411j, this.f96170f).get();
                if ((bttx.f150413a & 128) == 0) {
                    Status status = Status.f30107a;
                    btsi btsi = bttx.f150414b;
                    if (btsi == null) {
                        btsi = btsi.f150214c;
                    }
                    mo53236a(new axim(status, null, btsi.f150217b, bttx.f150415c, bttx.f150416d, bttx.f150417e, bttx.f150418f, bttx.f150419g, bttx.f150420h, null));
                    return;
                }
                bzvu bzvu2 = bttx.f150421i;
                if (bzvu2 == null) {
                    bzvu2 = bzvu.f171552g;
                }
                mo53235a(bzvu2);
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof AuthFailureError) {
                    mo53234a(16501);
                    return;
                }
                throw e2;
            }
        } else {
            bxvd da8 = btst.f150264i.mo74144da();
            String str7 = this.f96093j;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            btst btst = (btst) da8.f164949b;
            str7.getClass();
            btst.f150266a |= 1;
            btst.f150267b = str7;
            Contact contact2 = this.f96089a;
            if (contact2 == null) {
                bxvd da9 = btsf.f150195c.mo74144da();
                String a4 = axeo.m82423a(this.f96166b, this.f96170f);
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                btsf btsf3 = (btsf) da9.f164949b;
                a4.getClass();
                btsf3.f150197a = 4;
                btsf3.f150198b = a4;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btst btst2 = (btst) da8.f164949b;
                btsf btsf4 = (btsf) da9.mo74062i();
                btsf4.getClass();
                btst2.f150268c = btsf4;
                btst2.f150266a |= 2;
            } else {
                btsf a5 = axkp.m82676a(contact2);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btst btst3 = (btst) da8.f164949b;
                a5.getClass();
                btst3.f150268c = a5;
                btst3.f150266a |= 2;
            }
            bxvd da10 = btsb.f150174d.mo74144da();
            String str8 = this.f96091h;
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            btsb btsb5 = (btsb) da10.f164949b;
            str8.getClass();
            int i6 = btsb5.f150176a | 2;
            btsb5.f150176a = i6;
            btsb5.f150178c = str8;
            long j4 = this.f96090g;
            btsb5.f150176a = i6 | 1;
            btsb5.f150177b = j4;
            btsb btsb6 = (btsb) da10.mo74062i();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            btst btst4 = (btst) da8.f164949b;
            btsb6.getClass();
            btst4.f150269d = btsb6;
            int i7 = 4 | btst4.f150266a;
            btst4.f150266a = i7;
            String str9 = this.f96092i;
            if (str9 != null) {
                str9.getClass();
                btst4.f150266a = i7 | 8;
                btst4.f150270e = str9;
            }
            List<btrr> asList2 = Arrays.asList(m82681a(this.f96166b));
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            btst btst5 = (btst) da8.f164949b;
            if (!btst5.f150272g.mo73666a()) {
                btst5.f150272g = bxvk.m124019a(btst5.f150272g);
            }
            for (btrr btrr2 : asList2) {
                btst5.f150272g.mo74153d(btrr2.f150143g);
            }
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            btst btst6 = (btst) da8.f164949b;
            btst6.f150271f = 1;
            btst6.f150266a |= 32;
            if (!(this.f96096m == 0 && this.f96097n == null)) {
                bxvd da11 = btsg.f150200e.mo74144da();
                long j5 = this.f96096m;
                if (j5 != 0) {
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    btsg btsg4 = (btsg) da11.f164949b;
                    btsg4.f150202a |= 2;
                    btsg4.f150204c = j5;
                }
                byte[] bArr2 = this.f96097n;
                if (bArr2 != null) {
                    bxtx a6 = bxtx.m123261a(bArr2);
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    btsg btsg5 = (btsg) da11.f164949b;
                    a6.getClass();
                    btsg5.f150202a |= 8;
                    btsg5.f150205d = a6;
                }
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btst btst7 = (btst) da8.f164949b;
                btsg btsg6 = (btsg) da11.mo74062i();
                btsg6.getClass();
                btst7.f150273h = btsg6;
                btst7.f150266a |= 64;
            }
            try {
                btsu btsu = (btsu) axmo.m82727a("b/fundstransferv2/createRequestTransaction", this.f96167c, da8.mo74062i(), btsu.f150275e, this.f96170f).get();
                if ((btsu.f150277a & 2) == 0) {
                    Status status2 = Status.f30107a;
                    btsi btsi2 = btsu.f150278b;
                    if (btsi2 == null) {
                        btsi2 = btsi.f150214c;
                    }
                    mo53236a(new axim(status2, null, btsi2.f150217b, null, null, btsu.f150280d, null, null, null, null));
                    return;
                }
                bzvu bzvu3 = btsu.f150279c;
                if (bzvu3 == null) {
                    bzvu3 = bzvu.f171552g;
                }
                mo53235a(bzvu3);
            } catch (ExecutionException e3) {
                if (e3.getCause() instanceof AuthFailureError) {
                    mo53234a(16501);
                    return;
                }
                throw e3;
            }
        }
    }
}

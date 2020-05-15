package p000;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.walletp2p.model.Contact;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: axku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axku extends axlx {

    /* renamed from: a */
    private final Contact f96098a;

    /* renamed from: g */
    private final long f96099g;

    /* renamed from: h */
    private final String f96100h;

    /* renamed from: i */
    private final String f96101i;

    /* renamed from: j */
    private final String f96102j;

    /* renamed from: k */
    private final String f96103k;

    /* renamed from: l */
    private final String f96104l;

    /* renamed from: m */
    private final boolean f96105m;

    /* renamed from: n */
    private final boolean f96106n;

    /* renamed from: o */
    private final boolean f96107o;

    /* renamed from: p */
    private final long f96108p;

    /* renamed from: q */
    private final long f96109q;

    /* renamed from: r */
    private final byte[] f96110r;

    /* renamed from: s */
    private final byte[] f96111s;

    /* renamed from: t */
    private final List f96112t;

    public axku(Context context, int i, Account account, Contact contact, long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, long j2, long j3, byte[] bArr, byte[] bArr2, List list, axls axls, axls axls2) {
        super(context, i, account, axls, axls2);
        this.f96098a = contact;
        this.f96099g = j;
        this.f96100h = str;
        this.f96101i = str2;
        this.f96102j = str3;
        this.f96103k = str4;
        this.f96104l = str5;
        this.f96105m = z;
        this.f96106n = z2;
        this.f96107o = z3;
        this.f96108p = j2;
        this.f96109q = j3;
        this.f96110r = bArr;
        this.f96111s = bArr2;
        this.f96112t = list;
    }

    /* renamed from: a */
    private static final bngx m82683a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
            return bngx.m109358a(btrr.IDV_CHALLENGE, btrr.CVN_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE);
        }
        int i = Build.VERSION.SDK_INT;
        return bngx.m109359a(btrr.IDV_CHALLENGE, btrr.CVN_CHALLENGE, btrr.DEVICE_LOCK_CHALLENGE, btrr.PURCHASE_MANAGER_CHALLENGE);
    }

    /* renamed from: a */
    public final void mo53158a() {
        if (this.f96106n) {
            bxvd da = btsq.f150253c.mo74144da();
            bxvd da2 = btsz.f150308i.mo74144da();
            bxvd da3 = btsb.f150174d.mo74144da();
            long j = this.f96099g;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btsb btsb = (btsb) da3.f164949b;
            int i = btsb.f150176a | 1;
            btsb.f150176a = i;
            btsb.f150177b = j;
            String str = this.f96100h;
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
            if (this.f96110r != null) {
                btrs btrs = (btrs) btrt.f150144e.mo74144da();
                ByteString a = ByteString.m123261a(this.f96110r);
                if (btrs.f164950c) {
                    btrs.mo74035c();
                    btrs.f164950c = false;
                }
                btrt btrt = (btrt) btrs.f164949b;
                a.getClass();
                int i2 = btrt.f150146a | 1;
                btrt.f150146a = i2;
                btrt.f150147b = a;
                boolean z = this.f96107o;
                btrt.f150146a = i2 | 2;
                btrt.f150148c = z;
                btrs.mo70838a(this.f96112t);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btsz btsz2 = (btsz) da2.f164949b;
                btrt btrt2 = (btrt) btrs.mo74062i();
                btrt2.getClass();
                btsz2.f150317h = btrt2;
                btsz2.f150310a |= 128;
            }
            if (!TextUtils.isEmpty(this.f96101i)) {
                String str2 = this.f96101i;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btsz btsz3 = (btsz) da2.f164949b;
                str2.getClass();
                btsz3.f150310a |= 8;
                btsz3.f150314e = str2;
            }
            String str3 = this.f96103k;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsz btsz4 = (btsz) da2.f164949b;
            str3.getClass();
            btsz4.f150310a = 4 | btsz4.f150310a;
            btsz4.f150313d = str3;
            if (this.f96104l != null) {
                bxvd da4 = btsi.f150214c.mo74144da();
                String str4 = this.f96104l;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                btsi btsi = (btsi) da4.f164949b;
                str4.getClass();
                btsi.f150216a |= 1;
                btsi.f150217b = str4;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btsz btsz5 = (btsz) da2.f164949b;
                btsi btsi2 = (btsi) da4.mo74062i();
                btsi2.getClass();
                btsz5.f150315f = btsi2;
                btsz5.f150310a |= 16;
            }
            bxvd da5 = btrw.f150162c.mo74144da();
            String str5 = this.f96102j;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            btrw btrw = (btrw) da5.f164949b;
            str5.getClass();
            btrw.f150164a |= 1;
            btrw.f150165b = str5;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsz btsz6 = (btsz) da2.f164949b;
            btrw btrw2 = (btrw) da5.mo74062i();
            btrw2.getClass();
            btsz6.f150312c = btrw2;
            btsz6.f150310a |= 2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btsz btsz7 = (btsz) da2.f164949b;
            btsz7.f150316g = 2;
            btsz7.f150310a |= 64;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsq btsq = (btsq) da.f164949b;
            btsz btsz8 = (btsz) da2.mo74062i();
            btsz8.getClass();
            btsq.f150256b = btsz8;
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
                mo53236a(new axin(Status.f30107a, btsr.f150261c, null, null, null, null, null, null, null, btsr.f150262d));
            } catch (ExecutionException e) {
                if (e.getCause() instanceof AuthFailureError) {
                    mo53234a(16501);
                    return;
                }
                throw e;
            }
        } else if (this.f96105m) {
            bxvd da6 = btua.f150424m.mo74144da();
            String str6 = this.f96103k;
            String str7 = this.f96102j;
            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 2 + String.valueOf(str7).length());
            sb.append(str6);
            sb.append("::");
            sb.append(str7);
            String sb2 = sb.toString();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btua btua = (btua) da6.f164949b;
            sb2.getClass();
            btua.f150426a |= 1;
            btua.f150427b = sb2;
            if (this.f96110r != null) {
                btrs btrs2 = (btrs) btrt.f150144e.mo74144da();
                ByteString a2 = ByteString.m123261a(this.f96110r);
                if (btrs2.f164950c) {
                    btrs2.mo74035c();
                    btrs2.f164950c = false;
                }
                btrt btrt3 = (btrt) btrs2.f164949b;
                a2.getClass();
                int i3 = btrt3.f150146a | 1;
                btrt3.f150146a = i3;
                btrt3.f150147b = a2;
                boolean z2 = this.f96107o;
                btrt3.f150146a = i3 | 2;
                btrt3.f150148c = z2;
                btrs2.mo70838a(this.f96112t);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                btua btua2 = (btua) da6.f164949b;
                btrt btrt4 = (btrt) btrs2.mo74062i();
                btrt4.getClass();
                btua2.f150437l = btrt4;
                btua2.f150426a |= 512;
            }
            bxvd da7 = btrw.f150162c.mo74144da();
            String str8 = this.f96102j;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            btrw btrw3 = (btrw) da7.f164949b;
            str8.getClass();
            btrw3.f150164a |= 1;
            btrw3.f150165b = str8;
            btrw btrw4 = (btrw) da7.mo74062i();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btua btua3 = (btua) da6.f164949b;
            btrw4.getClass();
            btua3.f150428c = btrw4;
            btua3.f150426a |= 2;
            Contact contact = this.f96098a;
            if (contact != null) {
                btsf a3 = axkp.m82676a(contact);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                btua btua4 = (btua) da6.f164949b;
                a3.getClass();
                btua4.f150429d = a3;
                btua4.f150426a = 4 | btua4.f150426a;
            } else {
                bxvd da8 = btsf.f150195c.mo74144da();
                String a4 = axeo.m82423a(this.f96166b, this.f96170f);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btsf btsf = (btsf) da8.f164949b;
                a4.getClass();
                btsf.f150197a = 4;
                btsf.f150198b = a4;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                btua btua5 = (btua) da6.f164949b;
                btsf btsf2 = (btsf) da8.mo74062i();
                btsf2.getClass();
                btua5.f150429d = btsf2;
                btua5.f150426a = 4 | btua5.f150426a;
            }
            if (this.f96104l != null) {
                bxvd da9 = btsi.f150214c.mo74144da();
                String str9 = this.f96104l;
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                btsi btsi3 = (btsi) da9.f164949b;
                str9.getClass();
                btsi3.f150216a |= 1;
                btsi3.f150217b = str9;
                btsi btsi4 = (btsi) da9.mo74062i();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                btua btua6 = (btua) da6.f164949b;
                btsi4.getClass();
                btua6.f150436k = btsi4;
                btua6.f150426a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            bxvd da10 = btsb.f150174d.mo74144da();
            long j2 = this.f96099g;
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            btsb btsb3 = (btsb) da10.f164949b;
            int i4 = btsb3.f150176a | 1;
            btsb3.f150176a = i4;
            btsb3.f150177b = j2;
            String str10 = this.f96100h;
            str10.getClass();
            btsb3.f150176a = i4 | 2;
            btsb3.f150178c = str10;
            btsb btsb4 = (btsb) da10.mo74062i();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btua btua7 = (btua) da6.f164949b;
            btsb4.getClass();
            btua7.f150430e = btsb4;
            int i5 = btua7.f150426a | 8;
            btua7.f150426a = i5;
            String str11 = this.f96101i;
            if (str11 != null) {
                str11.getClass();
                i5 |= 16;
                btua7.f150426a = i5;
                btua7.f150431f = str11;
            }
            btua7.f150432g = 1;
            int i6 = i5 | 32;
            btua7.f150426a = i6;
            btua7.f150433h = 1;
            btua7.f150426a = i6 | 64;
            bngx a5 = m82683a(this.f96166b);
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btua btua8 = (btua) da6.f164949b;
            if (!btua8.f150434i.mo73666a()) {
                btua8.f150434i = GeneratedMessageLite.m124019a(btua8.f150434i);
            }
            int size = a5.size();
            for (int i7 = 0; i7 < size; i7++) {
                btua8.f150434i.mo74153d(((btrr) a5.get(i7)).f150143g);
            }
            if (!(this.f96108p == 0 && this.f96109q == 0 && this.f96111s == null)) {
                bxvd da11 = btsg.f150200e.mo74144da();
                long j3 = this.f96108p;
                if (j3 != 0) {
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    btsg btsg = (btsg) da11.f164949b;
                    btsg.f150202a = 1 | btsg.f150202a;
                    btsg.f150203b = j3;
                }
                long j4 = this.f96109q;
                if (j4 != 0) {
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    btsg btsg2 = (btsg) da11.f164949b;
                    btsg2.f150202a = 2 | btsg2.f150202a;
                    btsg2.f150204c = j4;
                }
                byte[] bArr = this.f96111s;
                if (bArr != null) {
                    ByteString a6 = ByteString.m123261a(bArr);
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    btsg btsg3 = (btsg) da11.f164949b;
                    a6.getClass();
                    btsg3.f150202a |= 8;
                    btsg3.f150205d = a6;
                }
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                btua btua9 = (btua) da6.f164949b;
                btsg btsg4 = (btsg) da11.mo74062i();
                btsg4.getClass();
                btua9.f150435j = btsg4;
                btua9.f150426a |= 128;
            }
            try {
                btub btub = (btub) axmo.m82727a("b/fundstransferv2/createPreparedSendTransaction", this.f96167c, da6.mo74062i(), btub.f150439j, this.f96170f).get();
                if ((btub.f150441a & 128) == 0) {
                    Status status = Status.f30107a;
                    btsi btsi5 = btub.f150442b;
                    if (btsi5 == null) {
                        btsi5 = btsi.f150214c;
                    }
                    mo53236a(new axin(status, null, btsi5.f150217b, btub.f150443c, btub.f150444d, btub.f150445e, btub.f150446f, btub.f150447g, btub.f150448h, null));
                    return;
                }
                bzvu bzvu2 = btub.f150449i;
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
            bxvd da12 = btsv.f150281k.mo74144da();
            String str12 = this.f96103k;
            String str13 = this.f96102j;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str12).length() + 2 + String.valueOf(str13).length());
            sb3.append(str12);
            sb3.append("::");
            sb3.append(str13);
            String sb4 = sb3.toString();
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            btsv btsv = (btsv) da12.f164949b;
            sb4.getClass();
            btsv.f150283a |= 1;
            btsv.f150284b = sb4;
            if (this.f96110r != null) {
                btrs btrs3 = (btrs) btrt.f150144e.mo74144da();
                ByteString a7 = ByteString.m123261a(this.f96110r);
                if (btrs3.f164950c) {
                    btrs3.mo74035c();
                    btrs3.f164950c = false;
                }
                btrt btrt5 = (btrt) btrs3.f164949b;
                a7.getClass();
                int i8 = btrt5.f150146a | 1;
                btrt5.f150146a = i8;
                btrt5.f150147b = a7;
                boolean z3 = this.f96107o;
                btrt5.f150146a = i8 | 2;
                btrt5.f150148c = z3;
                btrs3.mo70838a(this.f96112t);
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv2 = (btsv) da12.f164949b;
                btrt btrt6 = (btrt) btrs3.mo74062i();
                btrt6.getClass();
                btsv2.f150292j = btrt6;
                btsv2.f150283a |= 512;
            }
            bxvd da13 = btrw.f150162c.mo74144da();
            String str14 = this.f96102j;
            if (da13.f164950c) {
                da13.mo74035c();
                da13.f164950c = false;
            }
            btrw btrw5 = (btrw) da13.f164949b;
            str14.getClass();
            btrw5.f150164a |= 1;
            btrw5.f150165b = str14;
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            btsv btsv3 = (btsv) da12.f164949b;
            btrw btrw6 = (btrw) da13.mo74062i();
            btrw6.getClass();
            btsv3.f150285c = btrw6;
            btsv3.f150283a |= 2;
            Contact contact2 = this.f96098a;
            if (contact2 != null) {
                btsf a8 = axkp.m82676a(contact2);
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv4 = (btsv) da12.f164949b;
                a8.getClass();
                btsv4.f150286d = a8;
                btsv4.f150283a = 4 | btsv4.f150283a;
            } else {
                bxvd da14 = btsf.f150195c.mo74144da();
                String a9 = axeo.m82423a(this.f96166b, this.f96170f);
                if (da14.f164950c) {
                    da14.mo74035c();
                    da14.f164950c = false;
                }
                btsf btsf3 = (btsf) da14.f164949b;
                a9.getClass();
                btsf3.f150197a = 4;
                btsf3.f150198b = a9;
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv5 = (btsv) da12.f164949b;
                btsf btsf4 = (btsf) da14.mo74062i();
                btsf4.getClass();
                btsv5.f150286d = btsf4;
                btsv5.f150283a = 4 | btsv5.f150283a;
            }
            if (this.f96104l != null) {
                bxvd da15 = btsi.f150214c.mo74144da();
                String str15 = this.f96104l;
                if (da15.f164950c) {
                    da15.mo74035c();
                    da15.f164950c = false;
                }
                btsi btsi6 = (btsi) da15.f164949b;
                str15.getClass();
                btsi6.f150216a |= 1;
                btsi6.f150217b = str15;
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv6 = (btsv) da12.f164949b;
                btsi btsi7 = (btsi) da15.mo74062i();
                btsi7.getClass();
                btsv6.f150287e = btsi7;
                btsv6.f150283a |= 8;
            }
            bxvd da16 = btsb.f150174d.mo74144da();
            long j5 = this.f96099g;
            if (da16.f164950c) {
                da16.mo74035c();
                da16.f164950c = false;
            }
            btsb btsb5 = (btsb) da16.f164949b;
            int i9 = btsb5.f150176a | 1;
            btsb5.f150176a = i9;
            btsb5.f150177b = j5;
            String str16 = this.f96100h;
            str16.getClass();
            btsb5.f150176a = i9 | 2;
            btsb5.f150178c = str16;
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            btsv btsv7 = (btsv) da12.f164949b;
            btsb btsb6 = (btsb) da16.mo74062i();
            btsb6.getClass();
            btsv7.f150288f = btsb6;
            btsv7.f150283a |= 16;
            String str17 = this.f96101i;
            if (str17 != null) {
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv8 = (btsv) da12.f164949b;
                str17.getClass();
                btsv8.f150283a |= 32;
                btsv8.f150289g = str17;
            }
            bngx a10 = m82683a(this.f96166b);
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            btsv btsv9 = (btsv) da12.f164949b;
            if (!btsv9.f150290h.mo73666a()) {
                btsv9.f150290h = GeneratedMessageLite.m124019a(btsv9.f150290h);
            }
            int size2 = a10.size();
            for (int i10 = 0; i10 < size2; i10++) {
                btsv9.f150290h.mo74153d(((btrr) a10.get(i10)).f150143g);
            }
            if (!(this.f96108p == 0 && this.f96109q == 0 && this.f96111s == null)) {
                bxvd da17 = btsg.f150200e.mo74144da();
                long j6 = this.f96108p;
                if (j6 != 0) {
                    if (da17.f164950c) {
                        da17.mo74035c();
                        da17.f164950c = false;
                    }
                    btsg btsg5 = (btsg) da17.f164949b;
                    btsg5.f150202a = 1 | btsg5.f150202a;
                    btsg5.f150203b = j6;
                }
                long j7 = this.f96109q;
                if (j7 != 0) {
                    if (da17.f164950c) {
                        da17.mo74035c();
                        da17.f164950c = false;
                    }
                    btsg btsg6 = (btsg) da17.f164949b;
                    btsg6.f150202a |= 2;
                    btsg6.f150204c = j7;
                }
                byte[] bArr2 = this.f96111s;
                if (bArr2 != null) {
                    ByteString a11 = ByteString.m123261a(bArr2);
                    if (da17.f164950c) {
                        da17.mo74035c();
                        da17.f164950c = false;
                    }
                    btsg btsg7 = (btsg) da17.f164949b;
                    a11.getClass();
                    btsg7.f150202a |= 8;
                    btsg7.f150205d = a11;
                }
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btsv btsv10 = (btsv) da12.f164949b;
                btsg btsg8 = (btsg) da17.mo74062i();
                btsg8.getClass();
                btsv10.f150291i = btsg8;
                btsv10.f150283a |= 64;
            }
            try {
                btsw btsw = (btsw) axmo.m82727a("b/fundstransferv2/createSendTransaction", this.f96167c, da12.mo74062i(), btsw.f150294e, this.f96170f).get();
                if ((btsw.f150296a & 2) == 0) {
                    Status status2 = Status.f30107a;
                    btsi btsi8 = btsw.f150297b;
                    if (btsi8 == null) {
                        btsi8 = btsi.f150214c;
                    }
                    mo53236a(new axin(status2, null, btsi8.f150217b, null, null, btsw.f150299d, null, null, null, null));
                    return;
                }
                bzvu bzvu3 = btsw.f150298c;
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

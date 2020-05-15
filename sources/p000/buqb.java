package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: buqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class buqb {

    /* renamed from: a */
    private buqa f154695a;

    /* renamed from: b */
    private buqa f154696b;

    /* renamed from: c */
    private final ahfy f154697c;

    /* renamed from: f */
    protected final Context f154698f;

    public buqb(Context context) {
        this.f154698f = context;
        this.f154697c = new ahfy(context);
    }

    /* renamed from: a */
    public static byvm m120220a(String str, String str2, int i) {
        bxvd da = byvm.f168451k.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvm byvm = (byvm) da.f164949b;
            str.getClass();
            byvm.f168453a |= 4;
            byvm.f168455c = str;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvm byvm2 = (byvm) da.f164949b;
            str2.getClass();
            byvm2.f168453a |= 8;
            byvm2.f168456d = str2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvm byvm3 = (byvm) da.f164949b;
        byvm3.f168457e = i - 1;
        byvm3.f168453a |= 16;
        return (byvm) da.mo74062i();
    }

    /* renamed from: b */
    public final Long mo72977b(String str) {
        if (cfos.m141991e()) {
            return Long.valueOf(this.f154697c.mo36414a(str));
        }
        return null;
    }

    public buqb(Context context, byte[] bArr) {
        this(context);
        ahfr.m55664a("NearbySettingsLogger");
    }

    /* renamed from: a */
    public final void mo72972a(int i, ahcv ahcv) {
        bxvd da = bywk.f168584f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywk bywk = (bywk) da.f164949b;
        bywk.f168588c = 0;
        int i2 = bywk.f168586a | 2;
        bywk.f168586a = i2;
        bywk.f168590e = i - 1;
        int i3 = i2 | 8;
        bywk.f168586a = i3;
        bywk.f168587b = 2;
        int i4 = i3 | 1;
        bywk.f168586a = i4;
        if (ahcv instanceof ahci) {
            bywk.f168589d = 1;
            bywk.f168586a = i4 | 4;
        } else {
            if (ahcv instanceof ahcd) {
                bywk.f168589d = 2;
            } else {
                bywk.f168589d = 0;
            }
            bywk.f168586a = i4 | 4;
        }
        mo72975a((bywk) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo72973a(int i, ahcy ahcy) {
        int i2;
        bxvd da = bywk.f168584f.mo74144da();
        byte b = ahcy.f67032n;
        int i3 = 3;
        if (b == 1) {
            i3 = 2;
        } else if (b != 2) {
            i3 = b != 3 ? b != 4 ? 1 : 5 : 4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywk bywk = (bywk) da.f164949b;
        bywk.f168588c = i3 - 1;
        int i4 = bywk.f168586a | 2;
        bywk.f168586a = i4;
        bywk.f168590e = i - 1;
        int i5 = i4 | 8;
        bywk.f168586a = i5;
        if (ahcy instanceof ahdb) {
            bywk.f168587b = 1;
            int i6 = i5 | 1;
            bywk.f168586a = i6;
            if (ahcy instanceof ahcn) {
                bywk.f168589d = 1;
                bywk.f168586a = i6 | 4;
            } else {
                if (ahcy instanceof ahch) {
                    bywk.f168589d = 2;
                } else {
                    bywk.f168589d = 0;
                }
                bywk.f168586a = i6 | 4;
            }
        } else {
            if (ahcy instanceof ahcz) {
                bywk.f168587b = 2;
                int i7 = i5 | 1;
                bywk.f168586a = i7;
                if (ahcy instanceof ahck) {
                    bywk.f168589d = 1;
                    bywk.f168586a = i7 | 4;
                } else {
                    if (ahcy instanceof ahcf) {
                        bywk.f168589d = 2;
                    } else {
                        bywk.f168589d = 0;
                    }
                    i2 = i7 | 4;
                }
            } else {
                bywk.f168587b = 0;
                i2 = i5 | 1;
            }
            bywk.f168586a = i2;
        }
        mo72975a((bywk) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo72974a(byvm byvm, boolean z) {
        buqa buqa;
        if (Boolean.valueOf(z).booleanValue()) {
            if (this.f154695a == null) {
                this.f154695a = new buqa(new qws(rpr.m34216b(), "COPRESENCE", null));
            }
            buqa = this.f154695a;
        } else {
            if (this.f154696b == null) {
                this.f154696b = new buqa(new qws(rpr.m34216b(), "COPRESENCE_NO_IDS", null));
            }
            buqa = this.f154696b;
        }
        buqa.f154694a.mo24333a(byvm).mo24327b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72975a(bywk bywk) {
        byvm a = m120220a((String) null, (String) null, 7);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byvm byvm = (byvm) bxvd.f164949b;
        byvm byvm2 = byvm.f168451k;
        bywk.getClass();
        byvm.f168460h = bywk;
        byvm.f168453a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo72974a((byvm) bxvd.mo74062i(), true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo72976a(String str, String str2, bywm bywm) {
        byvm a = m120220a(str, str2, 6);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byvm byvm = (byvm) bxvd.f164949b;
        byvm byvm2 = byvm.f168451k;
        bywm.getClass();
        byvm.f168459g = bywm;
        byvm.f168453a |= 128;
        mo72974a((byvm) bxvd.mo74062i(), false);
    }
}

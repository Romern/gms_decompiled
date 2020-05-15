package p000;

import android.content.Context;
import android.util.LruCache;

/* renamed from: aaml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaml {

    /* renamed from: a */
    public final aakk f28466a;

    /* renamed from: b */
    public final LruCache f28467b = new LruCache(20);

    /* renamed from: c */
    private final Context f28468c;

    public aaml(Context context, aakk aakk) {
        this.f28468c = context;
        this.f28466a = aakk;
    }

    /* renamed from: b */
    private final void m21530b(String str) {
        this.f28466a.f28364a.mo24383c(str).mo24359a();
    }

    /* renamed from: a */
    public final void mo17031a(aamh aamh, String str, int i, int i2) {
        bxvd da = aaqk.f28904k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaqk aaqk = (aaqk) da.f164949b;
        aaqk.f28906a |= 8;
        aaqk.f28912g = i;
        int i3 = i2 - 1;
        aaqk.f28908c = Integer.valueOf(i3);
        aaqk.f28907b = 6;
        mo17034a(aamh, str, da);
        aaqi aaqi = aaqi.REASON_UNKNOWN;
        if (i3 == 1) {
            mo17035a("CLIENT_QUEUE_ERROR_MISSING_FROM_DB");
        } else if (i3 == 2) {
            mo17035a("CLIENT_QUEUE_ERROR_DIFFERENT_MESSAGE_IN_DB");
        } else if (i3 == 3) {
            mo17035a("CLIENT_QUEUE_DUPLICATE_MESSAGE");
        }
    }

    /* renamed from: b */
    public final void mo17036b(aamh aamh, String str, int i, int i2) {
        bxvd da = aaqk.f28904k.mo74144da();
        bxvd da2 = aaqo.f28924f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aaqo aaqo = (aaqo) da2.f164949b;
        aaqo.f28927b = 2;
        int i3 = aaqo.f28926a | 1;
        aaqo.f28926a = i3;
        aaqo.f28928c = i - 1;
        int i4 = i3 | 2;
        aaqo.f28926a = i4;
        int i5 = i4 | 4;
        aaqo.f28926a = i5;
        aaqo.f28929d = i2;
        aaqo.f28926a = i5 | 8;
        aaqo.f28930e = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaqk aaqk = (aaqk) da.f164949b;
        aaqo aaqo2 = (aaqo) da2.mo74062i();
        aaqo2.getClass();
        aaqk.f28908c = aaqo2;
        aaqk.f28907b = 4;
        if (cecz.m136063k()) {
            int a = aamm.m21537a(this.f28468c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaqk aaqk2 = (aaqk) da.f164949b;
            aaqk2.f28915j = a - 1;
            aaqk2.f28906a |= 64;
        }
        mo17034a(aamh, str, da);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17032a(aamh aamh, String str, int i, int i2, int i3, long j) {
        bxvd da = aaqk.f28904k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaqk aaqk = (aaqk) da.f164949b;
        aaqk.f28906a |= 8;
        aaqk.f28912g = i;
        bxvd da2 = aaqo.f28924f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aaqo aaqo = (aaqo) da2.f164949b;
        aaqo.f28927b = 1;
        int i4 = aaqo.f28926a | 1;
        aaqo.f28926a = i4;
        int i5 = i2 - 1;
        aaqo.f28928c = i5;
        int i6 = i4 | 2;
        aaqo.f28926a = i6;
        int i7 = i6 | 4;
        aaqo.f28926a = i7;
        aaqo.f28929d = i3;
        aaqo.f28926a = i7 | 8;
        aaqo.f28930e = j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaqk aaqk2 = (aaqk) da.f164949b;
        aaqo aaqo2 = (aaqo) da2.mo74062i();
        aaqo2.getClass();
        aaqk2.f28908c = aaqo2;
        aaqk2.f28907b = 4;
        if (cecz.m136063k()) {
            int a = aamm.m21537a(this.f28468c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaqk aaqk3 = (aaqk) da.f164949b;
            aaqk3.f28915j = a - 1;
            aaqk3.f28906a |= 64;
        }
        mo17034a(aamh, str, da);
        aaqi aaqi = aaqi.REASON_UNKNOWN;
        if (i5 != 1) {
            if (i5 != 2) {
                if (cecz.m136062j()) {
                    synchronized (this) {
                        this.f28467b.put(str, -1);
                    }
                    m21530b("CLIENT_QUEUE_ATTEMPTING_RETRY_ON_RESTART");
                }
            } else if (cecz.m136062j()) {
                synchronized (this) {
                    this.f28467b.put(str, Integer.valueOf(i3));
                }
                this.f28466a.f28364a.mo24385d("CLIENT_QUEUE_ATTEMPTING_RETRY_WITH_BACKOFF").mo24367a(i3);
            }
        } else if (cecz.m136062j()) {
            m21530b("CLIENT_QUEUE_NEW_MESSAGE");
            synchronized (this) {
                this.f28467b.put(str, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo17033a(aamh aamh, String str, int i, aaqi aaqi) {
        bxvd da = aaqk.f28904k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaqk aaqk = (aaqk) da.f164949b;
        aaqk.f28906a |= 8;
        aaqk.f28912g = i;
        aaqk.f28908c = Integer.valueOf(aaqi.f28902l);
        aaqk.f28907b = 5;
        mo17034a(aamh, str, da);
        aaqi aaqi2 = aaqi.REASON_UNKNOWN;
        int ordinal = aaqi.ordinal();
        if (ordinal == 1) {
            mo17035a("CLIENT_QUEUE_DROPPED_EXPIRED");
        } else if (ordinal == 2) {
            mo17035a("CLIENT_QUEUE_DROPPED_EXCEEDED_MAX_RETRIES");
        } else if (ordinal == 3) {
            mo17035a("CLIENT_QUEUE_DROPPED_EXCEEDED_STORAGE_LIMIT");
        } else if (ordinal == 10) {
            mo17035a("CLIENT_QUEUE_DROPPED_APP_RESTRICTED");
        }
    }

    /* renamed from: a */
    public final void mo17034a(aamh aamh, String str, bxvd bxvd) {
        if (cece.f182248a.mo6606a().mo78752a()) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aaqk aaqk = (aaqk) bxvd.f164949b;
            aaqk aaqk2 = aaqk.f28904k;
            str.getClass();
            int i = aaqk.f28906a | 1;
            aaqk.f28906a = i;
            aaqk.f28909d = str;
            String str2 = aamh.f28457a;
            str2.getClass();
            int i2 = i | 2;
            aaqk.f28906a = i2;
            aaqk.f28910e = str2;
            int i3 = aamh.f28458b;
            aaqk.f28906a = i2 | 4;
            aaqk.f28911f = i3;
            aaqk aaqk3 = (aaqk) bxvd.mo74062i();
            aakk aakk = this.f28466a;
            bxvd da = aaql.f28916c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaql aaql = (aaql) da.f164949b;
            aaqk3.getClass();
            aaql.f28919b = aaqk3;
            aaql.f28918a |= 4;
            aakk.mo16931a((aaql) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo17035a(String str) {
        if (cecz.m136062j()) {
            m21530b(str);
        }
    }
}

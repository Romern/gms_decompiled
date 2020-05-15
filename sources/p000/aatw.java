package p000;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aatw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatw {

    /* renamed from: a */
    public static final String[] f56574a = {"data2"};

    /* renamed from: b */
    public static final String[] f56575b = {"vnd.android.cursor.item/name"};

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 != 6) goto L_0x003a;
     */
    /* renamed from: a */
    public static bzps m47000a(bzps bzps, boolean z, HelpConfig helpConfig, Context context) {
        bzps bzps2 = bzps.UNKNOWN_CONTACT_MODE;
        int ordinal = bzps.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (helpConfig.mo43244s()) {
                        return bzps.EMAIL;
                    }
                }
            }
            if (z) {
                return bzps.UNKNOWN_CONTACT_MODE;
            }
            if (helpConfig.mo43235j()) {
                return bzps.C2C;
            }
            if (helpConfig.mo43229d(context)) {
                return bzps.PHONE;
            }
        } else if (helpConfig.f78837l == 3) {
            return bzps.CHAT;
        }
        return bzps.UNKNOWN_CONTACT_MODE;
    }

    /* renamed from: a */
    public static bzql m47001a(bzps bzps, HelpConfig helpConfig) {
        C1223np npVar = new C1223np();
        bzqp bzqp = helpConfig.f78835j;
        if (!(bzqp == null || bzqp.f171055g.size() == 0)) {
            bxwc bxwc = helpConfig.f78835j.f171055g;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bzql bzql = (bzql) bxwc.get(i);
                bzps a = bzps.m126020a(bzql.f171026b);
                if (a == null) {
                    a = bzps.UNKNOWN_CONTACT_MODE;
                }
                npVar.put(a, bzql);
            }
        }
        bzql bzql2 = (bzql) npVar.get(bzps);
        if (bzql2 != null) {
            return bzql2;
        }
        bxvd da = bzql.f171023f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzql bzql3 = (bzql) da.f164949b;
        int i2 = bzql3.f171025a | 4;
        bzql3.f171025a = i2;
        bzql3.f171029e = false;
        bzql3.f171026b = bzps.f170959i;
        bzql3.f171025a = i2 | 1;
        return (bzql) da.mo74062i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return r1;
     */
    /* renamed from: a */
    public static synchronized bzqp m47002a(aarp aarp) {
        synchronized (aatw.class) {
            bzqp bzqp = (bzqp) aarp.mo31696a("escalation_options", bzqp.f171047j);
            if (!(bzqp == null || (bzqp.f171049a & 4) == 0)) {
                String a = aarp.mo31697a("ongoing_chat_request_pool_id", "");
                if (!TextUtils.isEmpty(a)) {
                    bxvd bxvd = (bxvd) bzqp.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bzqp);
                    bzqm bzqm = bzqp.f171052d;
                    if (bzqm == null) {
                        bzqm = bzqm.f171030d;
                    }
                    bxvd bxvd2 = (bxvd) bzqm.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) bzqm);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bzqm bzqm2 = (bzqm) bxvd2.f164949b;
                    a.getClass();
                    bzqm2.f171032a |= 2;
                    bzqm2.f171034c = a;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bzqp bzqp2 = (bzqp) bxvd.f164949b;
                    bzqm bzqm3 = (bzqm) bxvd2.mo74062i();
                    bzqm3.getClass();
                    bzqp2.f171052d = bzqm3;
                    bzqp2.f171049a |= 4;
                    bzqp bzqp3 = (bzqp) bxvd.mo74062i();
                    return bzqp3;
                }
            }
        }
    }

    /* renamed from: a */
    public static sfr m47003a(Context context) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30215e = "com.google.android.gms";
        return sfr.m35174a(context, clientContext);
    }

    /* renamed from: a */
    public static synchronized void m47004a(bzqp bzqp, aarp aarp) {
        synchronized (aatw.class) {
            aarp.mo31698a(bzqp, "escalation_options");
        }
    }

    /* renamed from: a */
    public static boolean m47005a(bzql bzql) {
        return bzql.f171028d.size() > 0;
    }
}

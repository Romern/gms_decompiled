package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.List;
import java.util.Set;

/* renamed from: ajes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajes extends ajfd {

    /* renamed from: a */
    public final ClientAppIdentifier f70474a;

    /* renamed from: b */
    public final aiyx f70475b;

    /* renamed from: c */
    public final buqh f70476c;

    /* renamed from: d */
    public final Set f70477d;

    /* renamed from: o */
    private final List f70478o;

    /* renamed from: p */
    private final List f70479p;

    /* renamed from: q */
    private final List f70480q;

    /* renamed from: r */
    private final List f70481r;

    /* renamed from: s */
    private final bzcn f70482s;

    /* renamed from: t */
    private final bzcb f70483t;

    /* renamed from: u */
    private final aiwt f70484u;

    public ajes(Context context, buqh buqh, ClientAppIdentifier clientAppIdentifier, List list, List list2, List list3, List list4, bzcn bzcn, bzcb bzcb, aiwt aiwt, ajeu ajeu, Set set) {
        super(context, clientAppIdentifier, buqh, bzck.f169346h, "Report", ajeu);
        this.f70483t = bzcb;
        this.f70484u = aiwt;
        this.f70474a = clientAppIdentifier;
        this.f70478o = list;
        this.f70479p = list2;
        this.f70480q = list3;
        this.f70481r = list4;
        this.f70482s = bzcn;
        this.f70475b = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f70476c = buqh;
        this.f70477d = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo38551a() {
        boolean z;
        boolean z2;
        boolean z3;
        bxvf bxvf = (bxvf) bzcj.f169336h.mo74144da();
        bzcl b = mo38567b(this.f70474a.f80668c.f80723b);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcj bzcj = (bzcj) bxvf.f164949b;
        b.getClass();
        bzcj.f169339b = b;
        boolean z4 = true;
        bzcj.f169338a |= 1;
        List list = this.f70478o;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List list2 = this.f70479p;
        if (list2 == null || list2.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        List list3 = this.f70480q;
        if (list3 == null || list3.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        List list4 = this.f70481r;
        if (list4 == null || list4.isEmpty()) {
            z4 = false;
        }
        if (z || z2) {
            bxvf bxvf2 = (bxvf) bzcd.f169301c.mo74144da();
            if (z) {
                List list5 = this.f70478o;
                if (bxvf2.f164950c) {
                    bxvf2.mo74035c();
                    bxvf2.f164950c = false;
                }
                bzcd bzcd = (bzcd) bxvf2.f164949b;
                if (!bzcd.f169303a.mo73666a()) {
                    bzcd.f169303a = GeneratedMessageLite.m124021a(bzcd.f169303a);
                }
                bxsy.m123078a(list5, bzcd.f169303a);
            }
            if (z2) {
                List list6 = this.f70479p;
                if (bxvf2.f164950c) {
                    bxvf2.mo74035c();
                    bxvf2.f164950c = false;
                }
                bzcd bzcd2 = (bzcd) bxvf2.f164949b;
                if (!bzcd2.f169304b.mo73666a()) {
                    bzcd2.f169304b = GeneratedMessageLite.m124021a(bzcd2.f169304b);
                }
                bxsy.m123078a(list6, bzcd2.f169304b);
            }
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcj bzcj2 = (bzcj) bxvf.f164949b;
            bzcd bzcd3 = (bzcd) bxvf2.mo74062i();
            bzcd3.getClass();
            bzcj2.f169340c = bzcd3;
            bzcj2.f169338a |= 2;
        }
        if (z3 || z4) {
            bxvd da = bzcf.f169312c.mo74144da();
            if (z3) {
                List list7 = this.f70480q;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzcf bzcf = (bzcf) da.f164949b;
                bzcf.mo74523c();
                bxsy.m123078a(list7, bzcf.f169314a);
            }
            if (z4) {
                List list8 = this.f70481r;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzcf bzcf2 = (bzcf) da.f164949b;
                if (!bzcf2.f169315b.mo73666a()) {
                    bzcf2.f169315b = GeneratedMessageLite.m124021a(bzcf2.f169315b);
                }
                bxsy.m123078a(list8, bzcf2.f169315b);
            }
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcj bzcj3 = (bzcj) bxvf.f164949b;
            bzcf bzcf3 = (bzcf) da.mo74062i();
            bzcf3.getClass();
            bzcj3.f169341d = bzcf3;
            bzcj3.f169338a |= 4;
        }
        bzcn bzcn = this.f70482s;
        if (bzcn != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcj bzcj4 = (bzcj) bxvf.f164949b;
            bzcn.getClass();
            bzcj4.f169342e = bzcn;
            bzcj4.f169338a |= 8;
        }
        bzcb bzcb = this.f70483t;
        if (bzcb != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcj bzcj5 = (bzcj) bxvf.f164949b;
            bzcb.getClass();
            bzcj5.f169344g = bzcb;
            bzcj5.f169338a |= 32;
        }
        aiwt aiwt = this.f70484u;
        if (aiwt != null) {
            bzch a = ajem.m58604a(aiwt.mo38182b());
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcj bzcj6 = (bzcj) bxvf.f164949b;
            a.getClass();
            bzcj6.f169343f = a;
            bzcj6.f169338a |= 16;
        }
        aiyx aiyx = this.f70475b;
        ClientAppIdentifier clientAppIdentifier = this.f70474a;
        bzcj bzcj7 = (bzcj) bxvf.mo74062i();
        aiyx.f70119e.mo72984b();
        srn srn = ahfq.f67120a;
        while (true) {
            int size = aiyx.f70115a.size();
            byyk byyk = aiyx.f70118d.f70278f.f168927j;
            if (byyk == null) {
                byyk = byyk.f168943e;
            }
            if (size > byyk.f168948d) {
                aiyx.mo38317a(aiyx.mo38321b(clientAppIdentifier, (bxxc) aiyx.f70115a.get(0), 400));
                aiyx.mo38314a(0);
            } else {
                aiyx.f70115a.add(bzcj7);
                aiyx.f70116b.add(clientAppIdentifier);
                aiyx.f70117c.add(Long.valueOf(SystemClock.elapsedRealtime()));
                return (bzcj) bxvf.mo74062i();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bzcm mo38552a(bxxc bxxc) {
        bzck bzck = (bzck) bxxc;
        if (bzck == null) {
            return null;
        }
        bzcm bzcm = bzck.f169349b;
        return bzcm == null ? bzcm.f169369d : bzcm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo38553a(bxxc bxxc, bxxc bxxc2) {
        bzck bzck = (bzck) bxxc2;
        this.f70476c.mo72987c(new ajer(this, "ReportServerTask.createCallbackResponse", (bzcj) bxxc, bzck));
        return bzck;
    }
}

package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: muc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class muc {

    /* renamed from: a */
    public static final lvn f34740a = new lvn("BackUpNowLogger");

    /* renamed from: b */
    public final Map f34741b;

    /* renamed from: c */
    private final qws f34742c;

    /* renamed from: d */
    private final int f34743d;

    public muc(qws qws) {
        this.f34742c = qws;
        if (!ccno.f179554a.mo6606a().mo76476h()) {
            this.f34741b = new HashMap();
        } else {
            this.f34741b = new ConcurrentHashMap();
        }
        this.f34743d = new Random().nextInt(2147483646) + 1;
    }

    /* renamed from: a */
    public final mub mo20243a(String str) {
        if (this.f34741b.containsKey(str)) {
            return (mub) this.f34741b.get(str);
        }
        return new mub();
    }

    /* renamed from: a */
    public final void mo20244a(int i) {
        bxvd a = lyu.m24685a();
        bxvd da = mqo.f34328d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqo mqo = (mqo) da.f164949b;
        mqo.f34330a |= 1;
        mqo.f34332c = i;
        Map map = this.f34741b;
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            mub mub = (mub) map.get(str);
            bxvd da2 = mql.f34310e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mql mql = (mql) da2.f164949b;
            str.getClass();
            int i2 = mql.f34312a | 1;
            mql.f34312a = i2;
            mql.f34313b = str;
            mqn mqn = mub.f34738a;
            if (mqn != null) {
                mql.f34314c = mqn.f34327j;
                mql.f34312a = i2 | 2;
            }
            List list = mub.f34739b;
            if (list != null) {
                if (!mql.f34315d.mo73666a()) {
                    mql.f34315d = GeneratedMessageLite.m124021a(mql.f34315d);
                }
                bxsy.m123078a(list, mql.f34315d);
            }
            arrayList.add((mql) da2.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqo mqo2 = (mqo) da.f164949b;
        if (!mqo2.f34331b.mo73666a()) {
            mqo2.f34331b = GeneratedMessageLite.m124021a(mqo2.f34331b);
        }
        bxsy.m123078a(arrayList, mqo2.f34331b);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqo mqo3 = (mqo) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mqo3.getClass();
        mqk.f34306w = mqo3;
        mqk.f34284a |= 536870912;
        mo20245a((mqk) a.mo74062i(), mqj.BACK_UP_NOW_END);
    }

    /* renamed from: a */
    public final void mo20245a(mqk mqk, mqj mqj) {
        if (!ccli.f179330a.mo6606a().mo76270c()) {
            f34740a.logVerbose("Logging is disabled.", new Object[0]);
            return;
        }
        f34740a.logVerbose("Logging to Clearcut eventCode: %s, flowId: %d, event: %s", mqj, Integer.valueOf(this.f34743d), mqk);
        qwo a = this.f34742c.mo24335a(mqk.serializeToBytes());
        a.mo24328b(mqj.f34275R);
        a.mo24323a((long) this.f34743d);
        a.mo24327b();
    }
}

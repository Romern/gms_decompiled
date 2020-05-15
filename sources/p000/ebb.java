package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: ebb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebb extends dyd {

    /* renamed from: b */
    public static final dxr f14583b = new dxr(new eaz(), "UserVelocityProducer", new int[]{48}, new int[]{1});

    /* renamed from: j */
    private LinkedList f14584j;

    public ebb(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14583b, str, dqb);
    }

    /* renamed from: c */
    private final ContextData m10028c() {
        boolean z;
        double d;
        double d2;
        new Object[1][0] = Integer.valueOf(this.f14584j.size());
        if (this.f14584j.size() < 2) {
            return null;
        }
        ContextData contextData = (ContextData) this.f14584j.peekLast();
        LinkedList linkedList = this.f14584j;
        ContextData contextData2 = (ContextData) linkedList.get(linkedList.size() - 2);
        bxnm bxnm = (bxnm) contextData2.mo18009a(bxnm.f164051j);
        bxnm bxnm2 = (bxnm) contextData.mo18009a(bxnm.f164051j);
        if (bxnm == null || bxnm2 == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("ebb", "c", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[UserVelocityProducer] No UserLocation data.");
            return null;
        }
        double a = ayuo.m84843a(bxnm.f164054b, bxnm.f164055c, bxnm2.f164054b, bxnm2.f164055c);
        new Object[1][0] = Double.valueOf(a);
        float f = bxnm.f164059g;
        if (f == 0.0f || bxnm2.f164059g == 0.0f) {
            z = false;
        } else {
            z = true;
        }
        double hypot = Math.hypot((double) f, (double) bxnm2.f164059g);
        double c = (double) (contextData.mo18022j().mo18096c() - contextData2.mo18022j().mo18096c());
        Double.isNaN(c);
        double d3 = (a / c) * 1000.0d;
        if (z) {
            Double.isNaN(c);
            d = (hypot / c) * 1000.0d;
        } else {
            d = 0.0d;
        }
        double b = ayuo.m84848b(bxnm.f164054b, bxnm.f164055c, bxnm2.f164054b, bxnm2.f164055c);
        if (z) {
            float f2 = bxnm.f164059g;
            double d4 = (double) bxnm2.f164059g;
            double d5 = (double) f2;
            Double.isNaN(d5);
            Double.isNaN(d4);
            double d6 = d5 + d4;
            if (a < d6) {
                Double.isNaN(d4);
                Double.isNaN(d4);
                d2 = Math.asin(d4 / ((a * d4) / d6));
            } else {
                d2 = 3.141592653589793d;
            }
        } else {
            d2 = 0.0d;
        }
        long c2 = contextData2.mo18022j().mo18096c();
        long c3 = contextData.mo18022j().mo18096c();
        bxvd da = bxnn.f164061f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxnn bxnn = (bxnn) da.f164949b;
        int i = bxnn.f164064a | 1;
        bxnn.f164064a = i;
        bxnn.f164065b = d3;
        int i2 = i | 2;
        bxnn.f164064a = i2;
        bxnn.f164066c = b;
        if (d != 0.0d) {
            i2 |= 4;
            bxnn.f164064a = i2;
            bxnn.f164067d = d;
        }
        if (d2 != 0.0d) {
            bxnn.f164064a = i2 | 8;
            bxnn.f164068e = d2;
        }
        tip tip = new tip(3, 48, 2);
        tip.mo26574a(tka.m37118a(c2, c3));
        tip.mo26572a(bxnn.f164062g, (bxnn) da.mo74062i());
        return tip.mo26570a();
    }

    /* renamed from: e */
    private final void m10029e(ContextData contextData) {
        boolean z;
        double d;
        double d2;
        double d3;
        ContextData contextData2 = contextData;
        if (contextData.mo18018g() != 1) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("ebb", "e", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[UserVelocityProducer] Received unexpected context %s", Integer.toString(contextData.mo18018g()));
        } else if (contextData2.mo18009a(bxnm.f164051j) == null) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("ebb", "e", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[UserVelocityProducer] Received location context data without user location info.");
        } else if (contextData.mo18022j() == null) {
        } else {
            if (this.f14584j.isEmpty() || contextData.mo18022j().mo18096c() >= ((ContextData) this.f14584j.peekLast()).mo18022j().mo18096c()) {
                long c = !this.f14584j.isEmpty() ? contextData.mo18022j().mo18096c() - ((ContextData) this.f14584j.peekLast()).mo18022j().mo18096c() : Long.MAX_VALUE;
                if (c >= 20000) {
                    this.f14584j.offer(contextData2);
                    while (this.f14584j.size() > 10) {
                        this.f14584j.poll();
                    }
                    new Object[1][0] = Integer.valueOf(this.f14584j.size());
                    ContextData contextData3 = null;
                    if (this.f14584j.size() >= 2) {
                        ContextData contextData4 = (ContextData) this.f14584j.peekLast();
                        LinkedList linkedList = this.f14584j;
                        ContextData contextData5 = (ContextData) linkedList.get(linkedList.size() - 2);
                        bxnm bxnm = (bxnm) contextData5.mo18009a(bxnm.f164051j);
                        bxnm bxnm2 = (bxnm) contextData4.mo18009a(bxnm.f164051j);
                        if (bxnm == null || bxnm2 == null) {
                            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                            bnsl3.mo68432a("ebb", "c", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("[UserVelocityProducer] No UserLocation data.");
                        } else {
                            double a = ayuo.m84843a(bxnm.f164054b, bxnm.f164055c, bxnm2.f164054b, bxnm2.f164055c);
                            new Object[1][0] = Double.valueOf(a);
                            float f = bxnm.f164059g;
                            if (f == 0.0f || bxnm2.f164059g == 0.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                            double hypot = Math.hypot((double) f, (double) bxnm2.f164059g);
                            double c2 = (double) (contextData4.mo18022j().mo18096c() - contextData5.mo18022j().mo18096c());
                            Double.isNaN(c2);
                            double d4 = (a / c2) * 1000.0d;
                            if (z) {
                                Double.isNaN(c2);
                                d = (hypot / c2) * 1000.0d;
                            } else {
                                d = 0.0d;
                            }
                            double b = ayuo.m84848b(bxnm.f164054b, bxnm.f164055c, bxnm2.f164054b, bxnm2.f164055c);
                            if (z) {
                                float f2 = bxnm.f164059g;
                                double d5 = (double) bxnm2.f164059g;
                                d2 = d;
                                double d6 = (double) f2;
                                Double.isNaN(d6);
                                Double.isNaN(d5);
                                double d7 = d6 + d5;
                                if (a < d7) {
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    d3 = Math.asin(d5 / ((a * d5) / d7));
                                } else {
                                    d3 = 3.141592653589793d;
                                }
                            } else {
                                d2 = d;
                                d3 = 0.0d;
                            }
                            long c3 = contextData5.mo18022j().mo18096c();
                            long c4 = contextData4.mo18022j().mo18096c();
                            bxvd da = bxnn.f164061f.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxnn bxnn = (bxnn) da.f164949b;
                            int i = bxnn.f164064a | 1;
                            bxnn.f164064a = i;
                            bxnn.f164065b = d4;
                            int i2 = i | 2;
                            bxnn.f164064a = i2;
                            bxnn.f164066c = b;
                            if (d2 != 0.0d) {
                                i2 |= 4;
                                bxnn.f164064a = i2;
                                bxnn.f164067d = d2;
                            }
                            if (d3 != 0.0d) {
                                bxnn.f164064a = i2 | 8;
                                bxnn.f164068e = d3;
                            }
                            tip tip = new tip(3, 48, 2);
                            tip.mo26574a(tka.m37118a(c3, c4));
                            tip.mo26572a(bxnn.f164062g, (bxnn) da.mo74062i());
                            contextData3 = tip.mo26570a();
                        }
                    }
                    if (contextData3 != null) {
                        mo9856c(contextData3);
                        return;
                    }
                    return;
                }
                new Object[1][0] = Long.valueOf(c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        ArrayList arrayList;
        this.f14584j = new LinkedList();
        ContextManagerClientInfo a = dwq.m9652a(this.f14389e, "UserVelocityProducer");
        tit tit = new tit();
        tit.mo26579a(1);
        tit.mo26582b(10);
        eej a2 = dwq.m9672p().mo10037a((ContextDataFilterImpl) tit.mo26578a(), a);
        if (a2.f14775a == 0 && (arrayList = a2.f14776b) != null) {
            Collections.sort(arrayList, new eba());
            ArrayList arrayList2 = a2.f14776b;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ContextData contextData = (ContextData) arrayList2.get(i);
                if (contextData.mo18009a(bxnm.f164051j) != null) {
                    m10029e(contextData);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        m10029e(contextData);
    }
}

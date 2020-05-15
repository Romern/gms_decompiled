package p000;

import android.media.MediaRouter;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: alq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alq extends Handler {

    /* renamed from: a */
    final /* synthetic */ alt f846a;

    /* renamed from: b */
    private final ArrayList f847b = new ArrayList();

    public alq(alt alt) {
        this.f846a = alt;
    }

    /* renamed from: a */
    public final void mo983a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        and and;
        int a;
        and and2;
        int a2;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && this.f846a.mo985a().f874c.equals(((alv) obj).f874c)) {
            this.f846a.mo989a(true);
        }
        if (i != 262) {
            switch (i) {
                case 257:
                    anh anh = this.f846a.f856h;
                    alv alv = (alv) obj;
                    if (alv.mo1003e() == anh) {
                        and and3 = (and) anh;
                        int f = and3.mo1070f(amd.m1078a(and3.f967i));
                        if (f >= 0 && ((anb) and3.f974p.get(f)).f961b.equals(alv.f873b)) {
                            alv.mo1000b();
                            break;
                        }
                    } else {
                        and and4 = (and) anh;
                        MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) and4.f967i).createUserRoute((MediaRouter.RouteCategory) and4.f970l);
                        anc anc = new anc(alv, createUserRoute);
                        createUserRoute.setTag(anc);
                        createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) and4.f969k);
                        and4.mo1066a(anc);
                        and4.f975q.add(anc);
                        ((MediaRouter) and4.f967i).addUserRoute(createUserRoute);
                        break;
                    }
                case 258:
                    anh anh2 = this.f846a.f856h;
                    alv alv2 = (alv) obj;
                    if (alv2.mo1003e() != anh2 && (a = (and = (and) anh2).mo1064a(alv2)) >= 0) {
                        anc anc2 = (anc) and.f975q.remove(a);
                        ((MediaRouter.RouteInfo) anc2.f964b).setTag(null);
                        ((MediaRouter.UserRouteInfo) anc2.f964b).setVolumeCallback(null);
                        ((MediaRouter) and.f967i).removeUserRoute((MediaRouter.UserRouteInfo) anc2.f964b);
                        break;
                    }
                case 259:
                    anh anh3 = this.f846a.f856h;
                    alv alv3 = (alv) obj;
                    if (alv3.mo1003e() != anh3 && (a2 = (and2 = (and) anh3).mo1064a(alv3)) >= 0) {
                        and2.mo1066a((anc) and2.f975q.get(a2));
                        break;
                    }
            }
        } else {
            anh anh4 = this.f846a.f856h;
            alv alv4 = (alv) obj;
            alw.m1051a();
            if (alw.f893a.mo985a() == alv4) {
                if (alv4.mo1003e() == anh4) {
                    and and5 = (and) anh4;
                    int c = and5.mo1067c(alv4.f873b);
                    if (c >= 0) {
                        and5.mo1074h(((anb) and5.f974p.get(c)).f960a);
                    }
                } else {
                    and and6 = (and) anh4;
                    int a3 = and6.mo1064a(alv4);
                    if (a3 >= 0) {
                        and6.mo1074h(((anc) and6.f975q.get(a3)).f964b);
                    }
                }
            }
        }
        try {
            int size = this.f846a.f850b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    alw alw = (alw) ((WeakReference) this.f846a.f850b.get(size)).get();
                    if (alw != null) {
                        this.f847b.addAll(alw.f895c);
                    } else {
                        this.f846a.f850b.remove(size);
                    }
                } else {
                    int size2 = this.f847b.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        aln aln = (aln) this.f847b.get(i3);
                        alw alw2 = aln.f841a;
                        alm alm = aln.f842b;
                        int i4 = 65280 & i;
                        if (i4 == 256) {
                            alv alv5 = (alv) obj;
                            if ((aln.f844d & 2) != 0 || alv5.mo998a(aln.f843c)) {
                                switch (i) {
                                    case 257:
                                        alm.mo980a(alv5);
                                        break;
                                    case 258:
                                        alm.mo982c(alv5);
                                        break;
                                    case 259:
                                        alm.mo981b(alv5);
                                        break;
                                }
                            }
                        } else if (i4 == 512) {
                            alu alu = (alu) obj;
                        }
                    }
                    return;
                }
            }
        } finally {
            this.f847b.clear();
        }
    }
}

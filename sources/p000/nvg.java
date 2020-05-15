package p000;

import android.opengl.GLES20;
import android.os.Looper;
import android.os.Message;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* renamed from: nvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvg extends nvt {

    /* renamed from: a */
    final /* synthetic */ nvk f36593a;

    /* renamed from: b */
    private final Integer[] f36594b = new Integer[3];

    /* renamed from: c */
    private volatile boolean f36595c = false;

    /* renamed from: d */
    private final ConcurrentLinkedQueue f36596d = new ConcurrentLinkedQueue();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nvg(nvk nvk, Looper looper) {
        super(null, looper);
        this.f36593a = nvk;
        this.f36594b[0] = 0;
        this.f36594b[1] = 1;
        this.f36594b[2] = 2;
    }

    /* renamed from: a */
    private final void m27812a(int i, oos oos) {
        this.f36596d.add(new C1240of(this.f36594b[i], new nvf(oos)));
        sendMessageAtFrontOfQueue(obtainMessage(5));
    }

    /* renamed from: b */
    public final synchronized void mo21635b() {
        if (!this.f36595c) {
            this.f36595c = true;
            sendMessage(obtainMessage(3));
        }
    }

    @Deprecated
    /* renamed from: c */
    public final synchronized void mo21637c(oos oos) {
        if (!this.f36595c) {
            m27812a(2, oos);
        }
    }

    /* renamed from: d */
    public final synchronized void mo21638d(oos oos) {
        if (!this.f36595c) {
            sendMessage(obtainMessage(6, oos));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, oos]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, oos, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    public final void handleMessage(Message message) {
        if (this.f36595c && message.what != 3) {
            bnsn bnsn = nvk.f36599a;
            int i = message.what;
            return;
        }
        bpdo bpdo = bpdo.UNKNOWN_DETAIL;
        opv opv = null;
        switch (message.what) {
            case 1:
                this.f36593a.mo21710w();
                break;
            case 2:
                nvk nvk = this.f36593a;
                int i2 = message.arg1;
                bnsn bnsn2 = nvk.f36599a;
                opx opx = nvk.f36667m;
                if (opx != null && !opx.mo22509a(i2)) {
                    nvk.mo21710w();
                }
                break;
            case 3:
                ArrayList arrayList = new ArrayList();
                C1240of ofVar = (C1240of) this.f36596d.poll();
                while (ofVar != null) {
                    if (((Integer) ofVar.f26798a).intValue() == 0) {
                        arrayList.add(((nvf) ofVar.f26799b).f36591a);
                    }
                    ofVar = (C1240of) this.f36596d.poll();
                }
                nvk nvk2 = this.f36593a;
                bnsn bnsn3 = nvk.f36599a;
                nvk2.mo21657a(arrayList);
                break;
            case 4:
                try {
                    nvk nvk3 = this.f36593a;
                    bnsn bnsn4 = nvk.f36599a;
                    nvk3.mo21711x();
                    IntBuffer allocate = IntBuffer.allocate(nvk3.f36668n.f38091a.f37025c * nvk3.f36668n.f38091a.f37024b);
                    GLES20.glReadPixels(0, 0, nvk3.f36668n.f38091a.f37024b, nvk3.f36668n.f38091a.f37025c, 6408, 5121, allocate);
                    ExecutorService b = adzl.f62962b.mo25879b(2);
                    b.execute(new nuz(nvk3, (opz) message.obj, allocate));
                    b.shutdown();
                    break;
                } catch (opv e) {
                    opv = e;
                    break;
                }
            case 5:
                C1240of ofVar2 = (C1240of) this.f36596d.poll();
                while (ofVar2 != null) {
                    int intValue = ((Integer) ofVar2.f26798a).intValue();
                    if (intValue == 0) {
                        try {
                            nvk nvk4 = this.f36593a;
                            oos oos = ((nvf) ofVar2.f26799b).f36591a;
                            bnsn bnsn5 = nvk.f36599a;
                            int i3 = oos.mo22444i();
                            List list = (List) nvk4.f36617R.get(i3);
                            if (list == null) {
                                list = new ArrayList(2);
                                nvk4.f36617R.put(i3, list);
                            }
                            if (list.contains(oos)) {
                                bnsi d = nvk.f36599a.mo68390d();
                                d.mo68432a("nvk", "k", 3762, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68422a("window init window already in list %s for z %d", (Object) oos, i3);
                            } else {
                                nvk.m27837a(list, oos);
                            }
                            if (i3 % 2 == 0) {
                                if (!nvk4.mo21679c()) {
                                    List list2 = (List) nvk4.f36617R.get(i3 - 1);
                                    if (list2 != null) {
                                        list2.remove(oos);
                                    }
                                } else {
                                    List list3 = (List) nvk4.f36617R.get(i3 - 1);
                                    if (list3 != null && list3.remove(oos)) {
                                        list3.size();
                                    }
                                    List list4 = (List) nvk4.f36617R.get(i3 + 1);
                                    if (list4 != null && list4.remove(oos)) {
                                        list4.size();
                                    }
                                }
                            }
                            oos.mo22453r();
                            list.size();
                        } catch (opv e2) {
                            opv = e2;
                        }
                    } else if (intValue == 1) {
                        nvk nvk5 = this.f36593a;
                        oos oos2 = ((nvf) ofVar2.f26799b).f36591a;
                        bnsn bnsn6 = nvk.f36599a;
                        if (oos2 != null) {
                            int i4 = oos2.mo22444i();
                            if (i4 % 2 == 1) {
                                if (!nvk5.mo21679c()) {
                                    List list5 = (List) nvk5.f36617R.get(i4 + 1);
                                    if (list5 != null) {
                                        list5.remove(oos2);
                                    }
                                } else {
                                    int j = oos2.mo22445j();
                                    List list6 = (List) nvk5.f36617R.get(j);
                                    if (list6 != null && list6.remove(oos2)) {
                                        bnsi d2 = nvk.f36599a.mo68390d();
                                        d2.mo68432a("nvk", "o", 3878, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        d2.mo68425a("Removed window from stable z: %d. Window removed: %s. Remaining windows: %d", Integer.valueOf(j), oos2, Integer.valueOf(list6.size()));
                                    }
                                }
                            }
                            nvk5.f36621V.mo22483a(oos2);
                            oos2.mo22455t();
                            oos2.mo22418a(0L);
                            List list7 = (List) nvk5.f36617R.get(i4);
                            if (list7 == null || !list7.contains(oos2)) {
                                bnsi d3 = nvk.f36599a.mo68390d();
                                d3.mo68432a("nvk", "l", 3857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d3.mo68413a("window cleanup window not in list for z %d win %s", i4, (Object) oos2);
                                nvk5.mo21646B();
                            } else {
                                list7.remove(oos2);
                                if (list7.size() == 0) {
                                    nvk5.f36617R.remove(i4);
                                }
                                list7.size();
                                nvk5.mo21646B();
                            }
                        }
                    } else if (intValue == 2) {
                        if (this.f36593a.mo21679c()) {
                            nvk nvk6 = this.f36593a;
                            nvf nvf = (nvf) ofVar2.f26799b;
                            oos oos3 = nvf.f36591a;
                            int i5 = nvf.f36592b;
                            bnsn bnsn7 = nvk.f36599a;
                            nvk6.mo21682d(oos3, i5);
                        } else {
                            nvk nvk7 = this.f36593a;
                            oos oos4 = ((nvf) ofVar2.f26799b).f36591a;
                            bnsn bnsn8 = nvk.f36599a;
                            nvk7.mo21682d(oos4, 0);
                        }
                    }
                    ofVar2 = (C1240of) this.f36596d.poll();
                }
                break;
            case 6:
                bnsn bnsn9 = nvk.f36599a;
                ((oos) message.obj).mo22429a();
                break;
            case 7:
                nvk nvk8 = this.f36593a;
                bnsn bnsn10 = nvk.f36599a;
                biwb biwb = ((biwc) message.obj).f122071b;
                if (biwb == null) {
                    biwb = biwb.f122066a;
                }
                synchronized (nvk8.f36612M) {
                    if (!nvk8.f36613N.isEmpty()) {
                        nvk8.f36614O.push(new C1240of((Long) nvk8.f36613N.peekLast(), biwb));
                    } else {
                        nvk8.f36625Z.mo22243a(biwb);
                    }
                }
                break;
            default:
                int i6 = message.what;
                StringBuilder sb = new StringBuilder(23);
                sb.append("unknown msg ");
                sb.append(i6);
                throw new RuntimeException(sb.toString());
        }
        if (opv != null) {
            bnsi c = nvk.f36599a.mo68388c();
            c.mo68437a(opv);
            c.mo68432a("nvg", "handleMessage", 4262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("GlException in CompositionThread command %s", message.what);
            int i7 = this.f36593a.f36606G;
        }
    }

    /* renamed from: b */
    public final synchronized void mo21636b(oos oos) {
        if (!this.f36595c) {
            m27812a(1, oos);
        }
    }

    /* renamed from: a */
    public final synchronized void mo21630a() {
        if (!this.f36595c) {
            sendMessage(obtainMessage(1));
        }
    }

    /* renamed from: a */
    public final synchronized void mo21631a(long j, int i) {
        if (!this.f36595c) {
            sendMessageDelayed(obtainMessage(2, i, 0), j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo21632a(oos oos) {
        if (!this.f36595c) {
            m27812a(0, oos);
        }
    }

    /* renamed from: a */
    public final synchronized void mo21633a(oos oos, int i) {
        if (!this.f36595c) {
            nvf nvf = new nvf(oos);
            nvf.f36592b = i;
            this.f36596d.add(new C1240of(this.f36594b[2], nvf));
            sendMessageAtFrontOfQueue(obtainMessage(5));
        }
    }

    /* renamed from: a */
    public final synchronized void mo21634a(opz opz) {
        if (!this.f36595c) {
            sendMessage(obtainMessage(4, opz));
        }
    }
}

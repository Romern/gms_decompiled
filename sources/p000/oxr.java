package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.carsetup.fsm.impl.FsmController$StackEntry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxr {

    /* renamed from: a */
    public static final String f38570a = oxr.class.getSimpleName();

    /* renamed from: l */
    private static final bnsn f38571l = odk.m28481a("FsmController");

    /* renamed from: m */
    private static final Class f38572m = oxv.class;

    /* renamed from: b */
    public final Context f38573b;

    /* renamed from: c */
    final List f38574c;

    /* renamed from: d */
    final Class f38575d;

    /* renamed from: e */
    public final ArrayList f38576e;

    /* renamed from: f */
    public oxv f38577f;

    /* renamed from: g */
    int f38578g = 1;

    /* renamed from: h */
    boolean f38579h;

    /* renamed from: i */
    public oxt f38580i;

    /* renamed from: j */
    final ArrayList f38581j = new ArrayList();

    /* renamed from: k */
    public final oxs f38582k;

    public oxr(Context context, Class cls, List list, oxs oxs, Bundle bundle) {
        this.f38573b = context.getApplicationContext();
        this.f38575d = cls;
        this.f38574c = list;
        this.f38582k = oxs;
        if (bundle == null || bundle.getParcelableArrayList(f38570a) == null) {
            this.f38576e = new ArrayList();
        } else {
            this.f38576e = bundle.getParcelableArrayList(f38570a);
        }
    }

    /* renamed from: a */
    public final void mo22748a() {
        for (int size = this.f38576e.size() - 1; size >= 0; size--) {
            ((FsmController$StackEntry) this.f38576e.get(size)).f29665a.getName();
        }
    }

    /* renamed from: b */
    public final oxv mo22760b(Class cls) {
        try {
            oxv oxv = (oxv) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (cls.getAnnotation(oxx.class) != null) {
                oxv.f38586b = this.f38573b;
                oxv.f38587c = this;
                return oxv;
            }
            mo22748a();
            String valueOf = String.valueOf(oxv.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("No @Transitions annotation on ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } catch (ReflectiveOperationException e) {
            mo22748a();
            String valueOf2 = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
            sb2.append("Unable to instantiate state class: ");
            sb2.append(valueOf2);
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo22749a(Intent intent) {
        mo22757a(new oxo(intent));
    }

    /* renamed from: a */
    public final void mo22750a(bped bped) {
        this.f38582k.mo22669a(bped);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.Class, android.os.Bundle, boolean):void
     arg types: [java.lang.Class, ?[OBJECT, ARRAY], int]
     candidates:
      oxr.a(java.lang.Class, java.lang.String, android.os.Parcelable):void
      oxr.a(oxv, oxv, java.lang.String):void
      oxr.a(java.lang.Class, android.os.Bundle, boolean):void */
    /* renamed from: a */
    public final void mo22751a(Class cls) {
        mo22752a(cls, (Bundle) null, false);
    }

    /* renamed from: a */
    public final void mo22752a(Class cls, Bundle bundle, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        ArrayList arrayList = this.f38576e;
        bundle.putInt("com.google.android.fsm.FsmController.ARG_STATE_ID", ((FsmController$StackEntry) arrayList.get(arrayList.size() - 1)).f29668d);
        mo22757a(new oxn(cls, bundle, z));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, android.os.Parcelable]
     candidates:
      oxr.a(java.lang.String, android.os.Parcelable):void
      oxr.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo22753a(Class cls, String str, Parcelable parcelable) {
        oxv oxv = this.f38577f;
        oxv b = mo22760b(cls);
        this.f38577f = b;
        mo22759a(oxv, b, str);
        int i = this.f38578g;
        this.f38578g = i + 1;
        this.f38576e.add(new FsmController$StackEntry(cls, parcelable, i));
        mo22756a(str, (Object) parcelable);
    }

    /* renamed from: a */
    public final void mo22754a(String str) {
        mo22755a(str, (Parcelable) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, android.os.Parcelable]
     candidates:
      oxr.a(java.lang.String, android.os.Parcelable):void
      oxr.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo22755a(String str, Parcelable parcelable) {
        oxw oxw;
        bnsi d = f38571l.mo68390d();
        d.mo68432a("oxr", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("fireEvent(%s)", str);
        if (this.f38579h) {
            bnsi c = f38571l.mo68388c();
            c.mo68432a("oxr", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("State machine already stopped.  Event will be dropped: %s", str);
            return;
        }
        oxv oxv = this.f38577f;
        if (oxv == null) {
            throw new IllegalArgumentException("Start state has not been initialized");
        } else if (!oxv.mo17459b(str, parcelable)) {
            oxw[] a = ((oxx) this.f38577f.getClass().getAnnotation(oxx.class)).mo22769a();
            int length = a.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    oxw = null;
                    break;
                } else if (str.equals(a[i2].mo22764a())) {
                    oxw = a[i2];
                    break;
                } else {
                    i2++;
                }
            }
            if (oxw == null) {
                mo22748a();
                String valueOf = String.valueOf(this.f38577f.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
                sb.append("Transition for event '");
                sb.append(str);
                sb.append("' not found on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            } else if (!oxw.mo22768e()) {
                this.f38581j.clear();
                Class b = oxw.mo22765b();
                Class c2 = oxw.mo22766c();
                Class d2 = oxw.mo22767d();
                Class cls = f38572m;
                boolean z = (c2 == cls && d2 == cls) ? false : true;
                Class cls2 = f38572m;
                if (b == cls2 && c2 == cls2 && d2 == cls2) {
                    mo22748a();
                    ArrayList arrayList = this.f38576e;
                    String name = ((FsmController$StackEntry) arrayList.get(arrayList.size() - 1)).f29665a.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(name).length());
                    sb2.append("Transition for ");
                    sb2.append(str);
                    sb2.append(" on ");
                    sb2.append(name);
                    sb2.append(" must have at least a push or pop");
                    throw new RuntimeException(sb2.toString());
                }
                if (d2 != f38572m) {
                    ArrayList arrayList2 = this.f38576e;
                    if (((FsmController$StackEntry) arrayList2.get(arrayList2.size() - 1)).f29665a.equals(d2)) {
                        mo22748a();
                        ArrayList arrayList3 = this.f38576e;
                        String name2 = ((FsmController$StackEntry) arrayList3.get(arrayList3.size() - 1)).f29665a.getName();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(name2).length());
                        sb3.append("Transition for ");
                        sb3.append(str);
                        sb3.append(" on ");
                        sb3.append(name2);
                        sb3.append(" can't popTo itself.");
                        throw new RuntimeException(sb3.toString());
                    }
                }
                if (z) {
                    int size = this.f38576e.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        FsmController$StackEntry fsmController$StackEntry = (FsmController$StackEntry) this.f38576e.get(size);
                        if (!c2.getName().equals(fsmController$StackEntry.f29665a.getName())) {
                            if (d2.getName().equals(fsmController$StackEntry.f29665a.getName())) {
                                size++;
                                break;
                            }
                            size--;
                        } else {
                            break;
                        }
                    }
                    if (size >= 0) {
                        ArrayList arrayList4 = this.f38576e;
                        arrayList4.subList(size, arrayList4.size()).clear();
                    } else {
                        mo22748a();
                        if (c2 == f38572m) {
                            c2 = d2;
                        }
                        String valueOf2 = String.valueOf(c2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                        sb4.append("State ");
                        sb4.append(valueOf2);
                        sb4.append(" not found in stack");
                        throw new RuntimeException(sb4.toString());
                    }
                }
                if (b != f38572m) {
                    ArrayList arrayList5 = this.f38576e;
                    int size2 = arrayList5.size();
                    while (i < size2) {
                        int i3 = i + 1;
                        if (((FsmController$StackEntry) arrayList5.get(i)).f29665a != b) {
                            i = i3;
                        } else {
                            mo22748a();
                            String valueOf3 = String.valueOf(b);
                            String valueOf4 = String.valueOf(this.f38576e);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
                            sb5.append("State already appears in the stack: ");
                            sb5.append(valueOf3);
                            sb5.append(" ");
                            sb5.append(valueOf4);
                            throw new RuntimeException(sb5.toString());
                        }
                    }
                    mo22753a(b, str, parcelable);
                    return;
                }
                int size3 = this.f38576e.size();
                if (size3 > 0) {
                    FsmController$StackEntry fsmController$StackEntry2 = (FsmController$StackEntry) this.f38576e.get(size3 - 1);
                    oxv oxv2 = this.f38577f;
                    Class cls3 = fsmController$StackEntry2.f29665a;
                    Parcelable parcelable2 = fsmController$StackEntry2.f29666b;
                    oxv b2 = mo22760b(cls3);
                    this.f38577f = b2;
                    mo22759a(oxv2, b2, str);
                    mo22756a(str, (Object) parcelable);
                    return;
                }
                this.f38579h = true;
                mo22757a(new oxm());
            }
        }
    }

    /* renamed from: a */
    public final void mo22756a(String str, Object obj) {
        mo22748a();
        int size = this.f38574c.size();
        for (int i = 0; i < size; i++) {
            ove ove = (ove) this.f38574c.get(i);
            if ("EVENT_BACKBUTTON_PRESSED".equals(str) || "EVENT_CAR_PARKED".equals(str)) {
                ove.f38466a.f29648b = true;
            }
        }
        this.f38577f.mo17458a(str, obj);
    }

    /* renamed from: a */
    public final void mo22757a(oxp oxp) {
        oxt oxt = this.f38580i;
        if (oxt == null) {
            this.f38581j.add(oxp);
        } else {
            oxp.mo22661a(oxt);
        }
    }

    /* renamed from: a */
    public final void mo22758a(oxt oxt) {
        this.f38580i = oxt;
        while (this.f38581j.size() > 0) {
            ((oxp) this.f38581j.remove(0)).mo22661a(oxt);
        }
    }

    /* renamed from: a */
    public final void mo22759a(oxv oxv, oxv oxv2, String str) {
        int i;
        int i2 = -1;
        if (oxv != null) {
            i = oxv.mo17457a();
        } else {
            i = -1;
        }
        if (oxv2 != null) {
            i2 = oxv2.mo17457a();
        }
        this.f38582k.mo22668a(i, i2, this.f38582k.mo22665a(str));
    }
}

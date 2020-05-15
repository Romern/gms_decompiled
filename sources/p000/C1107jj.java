package p000;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: jj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1107jj implements C1103jf {

    /* renamed from: a */
    public int f22594a = 1;

    /* renamed from: b */
    public Bitmap f22595b;

    /* renamed from: c */
    public int f22596c;

    /* renamed from: d */
    private ArrayList f22597d = new ArrayList();

    /* renamed from: e */
    private ArrayList f22598e = new ArrayList();

    /* renamed from: f */
    private int f22599f = 8388613;

    /* renamed from: g */
    private int f22600g = -1;

    /* renamed from: h */
    private int f22601h = 80;

    /* renamed from: a */
    public final void mo13690a(C1102je jeVar) {
        Icon icon;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!this.f22597d.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            ArrayList arrayList = new ArrayList(this.f22597d.size());
            ArrayList arrayList2 = this.f22597d;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1099jb jbVar = (C1099jb) arrayList2.get(i2);
                int i3 = Build.VERSION.SDK_INT;
                int i4 = Build.VERSION.SDK_INT;
                IconCompat a = jbVar.mo13558a();
                if (a != null) {
                    icon = a.mo1113e();
                } else {
                    icon = null;
                }
                Notification.Action.Builder builder = new Notification.Action.Builder(icon, jbVar.f22070f, jbVar.f22071g);
                Bundle bundle3 = jbVar.f22065a;
                if (bundle3 != null) {
                    bundle = new Bundle(bundle3);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jbVar.f22067c);
                int i5 = Build.VERSION.SDK_INT;
                builder.setAllowGeneratedReplies(jbVar.f22067c);
                builder.addExtras(bundle);
                C1118ju[] juVarArr = jbVar.f22066b;
                if (juVarArr != null) {
                    for (RemoteInput remoteInput : C1118ju.m17342a(juVarArr)) {
                        builder.addRemoteInput(remoteInput);
                    }
                }
                arrayList.add(builder.build());
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i6 = this.f22594a;
        if (i6 != 1) {
            bundle2.putInt("flags", i6);
        }
        if (!this.f22598e.isEmpty()) {
            ArrayList arrayList3 = this.f22598e;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.f22595b;
        if (bitmap != null) {
            bundle2.putParcelable("background", bitmap);
        }
        int i7 = this.f22596c;
        if (i7 != 0) {
            bundle2.putInt("contentIcon", i7);
        }
        int i8 = this.f22599f;
        if (i8 != 8388613) {
            bundle2.putInt("contentIconGravity", i8);
        }
        if (this.f22600g != -1) {
            bundle2.putInt("contentActionIndex", 0);
        }
        int i9 = this.f22601h;
        if (i9 != 80) {
            bundle2.putInt("gravity", i9);
        }
        jeVar.mo13615a().putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1107jj jjVar = new C1107jj();
        jjVar.f22597d = new ArrayList(this.f22597d);
        jjVar.f22594a = this.f22594a;
        jjVar.f22598e = new ArrayList(this.f22598e);
        jjVar.f22595b = this.f22595b;
        jjVar.f22596c = this.f22596c;
        jjVar.f22599f = this.f22599f;
        jjVar.f22600g = this.f22600g;
        jjVar.f22601h = this.f22601h;
        return jjVar;
    }
}

package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpc implements View.OnClickListener, Comparable {

    /* renamed from: a */
    public final Context f17063a;

    /* renamed from: b */
    public final smi f17064b;

    /* renamed from: c */
    public Intent f17065c;

    /* renamed from: d */
    public CharSequence f17066d;

    /* renamed from: e */
    public boolean f17067e = true;

    /* renamed from: f */
    public final boolean f17068f;

    /* renamed from: g */
    public final List f17069g;

    /* renamed from: h */
    public final List f17070h;

    public fpc(Context context, int i, int i2, boolean z) {
        this.f17063a = context;
        this.f17068f = z;
        if (z) {
            this.f17064b = new smi(i, Process.myUid(), 7, i2);
        } else {
            this.f17064b = new smc("?", i, Process.myUid(), 7, i2);
        }
        this.f17069g = new ArrayList();
        this.f17070h = new ArrayList();
    }

    /* renamed from: a */
    public final int mo11089a() {
        return this.f17064b.f44748l;
    }

    /* renamed from: b */
    public final boolean mo11091b() {
        return this.f17065c != null && this.f17067e;
    }

    public void onClick(View view) {
        if (mo11091b() && this.f17065c != null) {
            try {
                view.getContext().startActivity(this.f17065c);
            } catch (ActivityNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public final int compareTo(fpc fpc) {
        return this.f17064b.compareTo(fpc.f17064b);
    }
}

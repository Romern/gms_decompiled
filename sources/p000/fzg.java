package p000;

import android.util.Property;

/* renamed from: fzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fzg extends Property {
    public fzg(String str) {
        super(Integer.class, str);
    }

    /* renamed from: a */
    public abstract void mo11533a(Object obj, int i);

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mo11533a(obj, ((Integer) obj2).intValue());
    }
}

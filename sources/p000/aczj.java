package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: aczj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczj extends C0058bp {

    /* renamed from: a */
    public boolean f61139a;

    /* renamed from: b */
    public boolean f61140b;

    /* renamed from: c */
    public boolean f61141c;

    /* renamed from: d */
    public ArrayList f61142d;

    /* renamed from: e */
    public String f61143e;

    /* renamed from: f */
    public Bundle f61144f;

    /* renamed from: g */
    private final String f61145g;

    /* renamed from: h */
    private final Context f61146h;

    /* renamed from: i */
    private bngx f61147i;

    public aczj(Context context, String str) {
        this.f61146h = context;
        this.f61145g = str;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        return new aczl(this.f61146h, this.f61145g, this.f61139a, this.f61140b, this.f61147i, this.f61141c, this.f61142d, this.f61143e, this.f61144f);
    }

    /* renamed from: a */
    public final void mo33270a(List list) {
        this.f61147i = list != null ? bngx.m109368a((Collection) list) : null;
    }
}

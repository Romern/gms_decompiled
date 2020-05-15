package p000;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ogn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ogn {

    /* renamed from: a */
    public final bmxj f37563a;

    /* renamed from: b */
    public final bmxj f37564b;

    /* renamed from: c */
    public final bmxj f37565c;

    /* renamed from: d */
    public bmzi f37566d;

    /* renamed from: e */
    public ohq f37567e;

    /* renamed from: f */
    public oaw f37568f;

    /* renamed from: g */
    public ogr f37569g;

    /* renamed from: h */
    public ofo f37570h = null;

    /* renamed from: i */
    public bmzi f37571i;

    /* renamed from: j */
    public ohk f37572j;

    /* renamed from: k */
    public final ohu f37573k;

    /* renamed from: l */
    public int f37574l;

    public ogn(Bundle bundle, SparseArray sparseArray) {
        int i = okk.f37859a;
        this.f37574l = 1;
        this.f37571i = null;
        this.f37573k = new ohu();
        this.f37563a = new ogh(this, bundle);
        this.f37564b = new ogi(bundle, sparseArray);
        this.f37565c = new ogj(sparseArray);
    }

    /* renamed from: a */
    public final void mo22120a(bmzi bmzi) {
        this.f37566d = bmzn.m108681a(bmzi);
    }

    public ogn(InputStream inputStream, OutputStream outputStream) {
        int i = okk.f37859a;
        this.f37574l = 1;
        this.f37571i = null;
        this.f37573k = new ohu();
        this.f37563a = new ogk(this, inputStream, outputStream);
        this.f37564b = ogl.f37561a;
        this.f37565c = ogm.f37562a;
    }
}

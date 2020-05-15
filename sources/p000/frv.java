package p000;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.List;

/* renamed from: frv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frv {

    /* renamed from: a */
    public STSortSpec f17159a;

    /* renamed from: b */
    private boolean f17160b;

    /* renamed from: c */
    private List f17161c;

    /* renamed from: d */
    private boolean f17162d;

    /* renamed from: e */
    private int f17163e = 0;

    /* renamed from: f */
    private boolean f17164f;

    /* renamed from: g */
    private final List f17165g = new ArrayList();

    /* renamed from: a */
    public final QuerySpecification mo11219a() {
        return new QuerySpecification(this.f17160b, null, this.f17161c, this.f17162d, 0, this.f17163e, this.f17164f, 0, true, sqc.m35960a(this.f17165g), null, this.f17159a, null, Integer.MAX_VALUE, null);
    }

    /* renamed from: b */
    public final void mo11221b() {
        this.f17162d = true;
    }

    /* renamed from: c */
    public final void mo11222c() {
        this.f17163e = 5;
    }

    /* renamed from: d */
    public final void mo11223d() {
        this.f17160b = true;
    }

    /* renamed from: a */
    public final void mo11220a(Section section) {
        if (section.f9683a.startsWith("semantic#")) {
            if (this.f17161c == null) {
                this.f17164f = true;
                this.f17161c = new ArrayList();
            } else if (!this.f17164f) {
                throw new IllegalArgumentException("Cannot mix literal and semantic sections");
            }
            this.f17161c.add(section);
            return;
        }
        if (this.f17161c == null) {
            this.f17164f = false;
            this.f17161c = new ArrayList();
        } else if (this.f17164f) {
            throw new IllegalArgumentException("Cannot mix literal and semantic sections");
        }
        this.f17161c.add(section);
    }
}

package p000;

import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsa {

    /* renamed from: a */
    public String f17178a;

    /* renamed from: b */
    public boolean f17179b;

    /* renamed from: c */
    public int f17180c = 1;

    /* renamed from: d */
    public boolean f17181d;

    /* renamed from: e */
    public String f17182e;

    /* renamed from: f */
    public String f17183f;

    /* renamed from: g */
    public ScoringConfig f17184g;

    /* renamed from: h */
    private final String f17185h;

    /* renamed from: i */
    private final List f17186i = new ArrayList();

    public fsa(String str) {
        this.f17185h = str;
    }

    /* renamed from: a */
    public final RegisterSectionInfo mo11234a() {
        String str = this.f17185h;
        String str2 = this.f17178a;
        boolean z = this.f17179b;
        int i = this.f17180c;
        boolean z2 = this.f17181d;
        String str3 = this.f17182e;
        List list = this.f17186i;
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, (Feature[]) list.toArray(new Feature[list.size()]), this.f17183f, this.f17184g);
    }

    /* renamed from: a */
    public final void mo11235a(Feature feature) {
        Feature.m6141a(this.f17186i, feature);
    }
}

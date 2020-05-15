package p000;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.GetOptions;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: abwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwa extends abxm {

    /* renamed from: a */
    final /* synthetic */ String f58599a;

    /* renamed from: b */
    final /* synthetic */ GetOptions f58600b;

    /* renamed from: c */
    final /* synthetic */ abvo f58601c;

    /* renamed from: d */
    final /* synthetic */ String[] f58602d;

    /* renamed from: e */
    final /* synthetic */ briu f58603e;

    /* renamed from: f */
    final /* synthetic */ briw f58604f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abwa(briw briw, abyp abyp, abwu abwu, abym abym, abxp abxp, String str, GetOptions getOptions, abvo abvo, String[] strArr, briu briu) {
        super(abyp, abwu, abym, abxp);
        this.f58604f = briw;
        this.f58599a = str;
        this.f58600b = getOptions;
        this.f58601c = abvo;
        this.f58602d = strArr;
        this.f58603e = briu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo32376a() {
        Thing a;
        List a2 = this.f58604f.mo69577a(this.f58599a);
        if (this.f58600b.f152336b && (a = this.f58604f.mo69576a(this.f58601c, a2, this.f58599a, this.f58602d[0])) != null) {
            return Arrays.asList(a);
        }
        List a3 = this.f58604f.mo69578a(a2, this.f58602d);
        return a3.isEmpty() ? Collections.emptyList() : a3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32377a(Status status, Object obj) {
        this.f58603e.mo69572a(status, (List) obj);
    }
}

package p000;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fry {

    /* renamed from: a */
    public String f17166a;

    /* renamed from: b */
    public Uri f17167b;

    /* renamed from: c */
    public final List f17168c = new ArrayList();

    /* renamed from: d */
    public GlobalSearchCorpusConfig f17169d;

    /* renamed from: e */
    public boolean f17170e;

    /* renamed from: f */
    public Account f17171f;

    /* renamed from: g */
    public RegisterCorpusIMEInfo f17172g;

    /* renamed from: h */
    public String f17173h;
    @Deprecated

    /* renamed from: i */
    public boolean f17174i;

    /* renamed from: j */
    public int f17175j;

    /* renamed from: k */
    private final String f17176k;

    public fry(String str) {
        this.f17176k = str;
    }

    /* renamed from: a */
    public final RegisterCorpusInfo mo11228a() {
        String str = this.f17176k;
        String str2 = this.f17166a;
        Uri uri = this.f17167b;
        List list = this.f17168c;
        return new RegisterCorpusInfo(str, str2, uri, (RegisterSectionInfo[]) list.toArray(new RegisterSectionInfo[list.size()]), this.f17169d, this.f17170e, this.f17171f, this.f17172g, this.f17173h, this.f17174i, this.f17175j);
    }

    /* renamed from: a */
    public final void mo11229a(RegisterSectionInfo registerSectionInfo) {
        this.f17168c.add(registerSectionInfo);
    }

    /* renamed from: a */
    public final void mo11230a(fsa fsa) {
        this.f17168c.add(fsa.mo11234a());
    }

    /* renamed from: a */
    public final void mo11231a(String str) {
        this.f17167b = str != null ? Uri.parse(str) : null;
    }
}

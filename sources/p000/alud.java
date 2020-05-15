package p000;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: alud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alud implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final String f74292a;

    /* renamed from: b */
    public final String f74293b;

    /* renamed from: c */
    public final String f74294c;

    /* renamed from: d */
    public final Boolean f74295d;

    /* renamed from: e */
    private final List f74296e;

    public alud(String str, String str2, String str3, Boolean bool, List list) {
        this.f74292a = str;
        this.f74293b = str2;
        this.f74294c = str3;
        this.f74295d = bool;
        this.f74296e = list;
    }

    /* renamed from: a */
    public static final aluh m61880a(Exception exc, String str) {
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(exc, new PrintWriter(stringWriter));
        return aluh.m61891a(String.valueOf(str).concat("_error"), stringWriter.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            alud alud = (alud) obj;
            return bmxi.m108538a(this.f74292a, alud.f74292a) && bmxi.m108538a(this.f74293b, alud.f74293b) && bmxi.m108538a(this.f74294c, alud.f74294c) && this.f74296e.equals(alud.f74296e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f74292a, this.f74293b, this.f74294c, this.f74296e});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("name", this.f74292a);
        a.mo66885a("consentText", this.f74293b);
        a.mo66885a("feedbackComponent", this.f74294c);
        a.mo66885a("debugDataSources", this.f74296e);
        a.mo66880a();
        return a.toString();
    }

    /* renamed from: a */
    public final bngx mo40789a() {
        return bngx.m109368a((Collection) this.f74296e);
    }
}

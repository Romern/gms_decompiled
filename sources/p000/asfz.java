package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfz {

    /* renamed from: a */
    public final List f88881a = new ArrayList();

    /* renamed from: b */
    public final List f88882b = new ArrayList();

    /* renamed from: c */
    boolean f88883c = false;

    /* renamed from: d */
    boolean f88884d = false;

    /* renamed from: e */
    Pair f88885e;

    /* renamed from: f */
    List f88886f;

    public asfz() {
        new ArrayList();
        this.f88885e = null;
        this.f88886f = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49141a() {
        this.f88885e = null;
        this.f88886f = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49142b() {
        if (this.f88885e == null || this.f88886f.size() == 0) {
            mo49141a();
            return;
        }
        bxvd da = borg.f134407d.mo74144da();
        borf borf = (borf) this.f88885e.second;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        borg borg = (borg) da.f164949b;
        borf.getClass();
        borg.f134410b = borf;
        borg.f134409a |= 1;
        List list = this.f88886f;
        if (!borg.f134411c.mo73666a()) {
            borg.f134411c = GeneratedMessageLite.m124021a(borg.f134411c);
        }
        bxsy.m123078a(list, borg.f134411c);
        borg borg2 = (borg) da.mo74062i();
        if (this.f88883c) {
            this.f88881a.add(Pair.create((Integer) this.f88885e.first, borg2));
        } else if (this.f88884d) {
            this.f88882b.add(Pair.create((Integer) this.f88885e.first, borg2));
        }
        mo49141a();
    }
}

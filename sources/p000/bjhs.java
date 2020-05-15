package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bjhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjhs {

    /* renamed from: a */
    public final bxuq f122744a;

    /* renamed from: b */
    public bjhr f122745b;

    /* renamed from: c */
    public boolean f122746c = true;

    public bjhs(bxuq bxuq) {
        this.f122744a = bxuq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo65241a(int i) {
        throw new UnsupportedOperationException("GetValueByField is not supported yet");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65243a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65245a(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bxxc mo65248b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65249b(Bundle bundle) {
    }

    /* renamed from: c */
    public boolean mo65250c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo65251d() {
        return true;
    }

    /* renamed from: a */
    public List mo65242a() {
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo65244a(bjgf bjgf) {
        bjhr bjhr = this.f122745b;
        if (bjhr != null && this.f122746c) {
            bjhr.mo65240a(bjgf);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65246a(Object obj) {
        throw new UnsupportedOperationException("SetValueByField is not supported yet");
    }

    /* renamed from: a */
    public void mo65247a(Collection collection) {
        throw new UnsupportedOperationException("setActiveValidationIds is not supported yet");
    }
}

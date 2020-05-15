package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: tl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1381tl extends C1341rz {

    /* renamed from: a */
    final C1526yv f27135a;

    /* renamed from: b */
    boolean f27136b;

    /* renamed from: c */
    final Window.Callback f27137c;

    /* renamed from: d */
    private boolean f27138d;

    /* renamed from: e */
    private boolean f27139e;

    /* renamed from: f */
    private final ArrayList f27140f = new ArrayList();

    /* renamed from: g */
    private final Runnable f27141g = new C1376tg(this);

    /* renamed from: h */
    private final adx f27142h = new C1377th(this);

    public C1381tl(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f27135a = new aeb(toolbar, false);
        C1380tk tkVar = new C1380tk(this, callback);
        this.f27137c = tkVar;
        C1526yv yvVar = this.f27135a;
        ((aeb) yvVar).f314e = tkVar;
        toolbar.f1351q = this.f27142h;
        yvVar.mo493a(charSequence);
    }

    /* renamed from: a */
    public final View mo15837a() {
        return ((aeb) this.f27135a).f312c;
    }

    /* renamed from: b */
    public final CharSequence mo15849b() {
        return this.f27135a.mo504e();
    }

    /* renamed from: c */
    public final int mo15854c() {
        return ((aeb) this.f27135a).f311b;
    }

    /* renamed from: d */
    public final void mo15859d() {
        this.f27135a.mo505e(0);
    }

    /* renamed from: d */
    public final void mo15861d(boolean z) {
    }

    /* renamed from: e */
    public final void mo15862e() {
        this.f27135a.mo505e(8);
    }

    /* renamed from: e */
    public final void mo15864e(boolean z) {
    }

    /* renamed from: f */
    public final void mo15865f(int i) {
        this.f27135a.mo503d(i);
    }

    /* renamed from: g */
    public final Context mo15868g() {
        return this.f27135a.mo495b();
    }

    /* renamed from: h */
    public final float mo15869h() {
        return C1280ps.m19933o(((aeb) this.f27135a).f310a);
    }

    /* renamed from: i */
    public final boolean mo15870i() {
        return this.f27135a.mo511k();
    }

    /* renamed from: j */
    public final boolean mo15871j() {
        return this.f27135a.mo512l();
    }

    /* renamed from: k */
    public final boolean mo15872k() {
        ((aeb) this.f27135a).f310a.removeCallbacks(this.f27141g);
        C1280ps.m19891a(((aeb) this.f27135a).f310a, this.f27141g);
        return true;
    }

    /* renamed from: l */
    public final boolean mo15873l() {
        if (!this.f27135a.mo501c()) {
            return false;
        }
        this.f27135a.mo502d();
        return true;
    }

    /* renamed from: m */
    public final void mo15874m() {
        ((aeb) this.f27135a).f310a.removeCallbacks(this.f27141g);
    }

    /* renamed from: n */
    public final void mo15875n() {
    }

    /* renamed from: o */
    public final void mo15876o() {
        mo15841a(16, 16);
    }

    /* renamed from: p */
    public final void mo15877p() {
    }

    /* renamed from: q */
    public final Menu mo16019q() {
        if (!this.f27138d) {
            C1526yv yvVar = this.f27135a;
            C1378ti tiVar = new C1378ti(this);
            C1379tj tjVar = new C1379tj(this);
            Toolbar toolbar = ((aeb) yvVar).f310a;
            toolbar.f1354t = tiVar;
            toolbar.f1355u = tjVar;
            ActionMenuView actionMenuView = toolbar.f1335a;
            if (actionMenuView != null) {
                actionMenuView.mo1299a(tiVar, tjVar);
            }
            this.f27138d = true;
        }
        return ((aeb) this.f27135a).f310a.mo1700j();
    }

    /* renamed from: a */
    public final void mo15839a(float f) {
        C1280ps.m19918f(((aeb) this.f27135a).f310a, f);
    }

    /* renamed from: b */
    public final void mo15850b(int i) {
        this.f27135a.mo488a(i);
    }

    /* renamed from: c */
    public final void mo15855c(int i) {
        C1526yv yvVar = this.f27135a;
        yvVar.mo498b(yvVar.mo495b().getText(i));
    }

    /* renamed from: d */
    public final void mo15860d(int i) {
        mo15841a(i, -1);
    }

    /* renamed from: e */
    public final void mo15863e(int i) {
        this.f27135a.mo499c(i);
    }

    /* renamed from: f */
    public final void mo15866f(boolean z) {
        if (z != this.f27139e) {
            this.f27139e = z;
            int size = this.f27140f.size();
            for (int i = 0; i < size; i++) {
                ((C1340ry) this.f27140f.get(i)).mo15836a();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.Toolbar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo15840a(int i) {
        mo15843a(LayoutInflater.from(this.f27135a.mo495b()).inflate(i, (ViewGroup) ((aeb) this.f27135a).f310a, false));
    }

    /* renamed from: b */
    public final void mo15851b(Drawable drawable) {
        C1280ps.m19890a(((aeb) this.f27135a).f310a, drawable);
    }

    /* renamed from: c */
    public final void mo15856c(Drawable drawable) {
        this.f27135a.mo497b(drawable);
    }

    /* renamed from: a */
    public final void mo15841a(int i, int i2) {
        C1526yv yvVar = this.f27135a;
        yvVar.mo496b((i & i2) | ((i2 ^ -1) & ((aeb) yvVar).f311b));
    }

    /* renamed from: c */
    public final void mo15857c(CharSequence charSequence) {
        this.f27135a.mo493a(charSequence);
    }

    /* renamed from: f */
    public final boolean mo15867f() {
        return ((aeb) this.f27135a).f310a.getVisibility() == 0;
    }

    /* renamed from: a */
    public final void mo15842a(Drawable drawable) {
        this.f27135a.mo489a(drawable);
    }

    /* renamed from: b */
    public final void mo15852b(CharSequence charSequence) {
        this.f27135a.mo500c(charSequence);
    }

    /* renamed from: c */
    public final void mo15858c(boolean z) {
        mo15841a(!z ? 0 : 8, 8);
    }

    /* renamed from: a */
    public final void mo15843a(View view) {
        mo15844a(view, new C1339rx(-2, -2));
    }

    /* renamed from: b */
    public final void mo15853b(boolean z) {
        mo15841a(!z ? 0 : 4, 4);
    }

    /* renamed from: a */
    public final void mo15844a(View view, C1339rx rxVar) {
        if (view != null) {
            view.setLayoutParams(rxVar);
        }
        this.f27135a.mo491a(view);
    }

    /* renamed from: a */
    public final void mo15845a(CharSequence charSequence) {
        this.f27135a.mo498b(charSequence);
    }

    /* renamed from: a */
    public final void mo15846a(boolean z) {
        mo15841a(!z ? 0 : 2, 2);
    }

    /* renamed from: a */
    public final boolean mo15847a(int i, KeyEvent keyEvent) {
        int i2;
        Menu q = mo16019q();
        if (q == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        q.setQwertyMode(z);
        return q.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final boolean mo15848a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo15870i();
        }
        return true;
    }
}

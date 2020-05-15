package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bkja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkja extends deu implements bkdb, bjer {

    /* renamed from: b */
    public bkjc f124357b;

    /* renamed from: c */
    private LogContext f124358c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bkjc mo60132a(bmki bmki, ArrayList arrayList, int i, LogContext logContext);

    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        throw null;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.singletonList(this.f124357b);
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
        throw new UnsupportedOperationException("Top level UiNode doesn't support custom parents.");
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo60133e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo60134g() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window;
        aymt.m84282a(getApplicationContext());
        bdyx.m91614a(getApplicationContext());
        Intent intent = getIntent();
        mo60134g();
        super.onCreate(bundle);
        setContentView(mo60133e());
        Bundle bundleExtra = intent.getBundleExtra("parcelableBundle");
        this.f124358c = (LogContext) bundleExtra.getParcelable("parentLogContext");
        bmki bmki = (bmki) bjvp.m104730a(bundleExtra, "formProto", (bxxk) bmki.f129802w.mo74142c(7));
        mo8626a((Toolbar) findViewById(C0126R.C0129id.popup_redirect_toolbar));
        setTitle(intent.getStringExtra("title"));
        bkjc bkjc = (bkjc) getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_holder);
        this.f124357b = bkjc;
        if (bkjc == null) {
            this.f124357b = mo60132a(bmki, (ArrayList) bjvp.m104742b(bundleExtra, "successfullyValidatedApps", (bxxk) bmkd.f129781l.mo74142c(7)), intent.getIntExtra("formThemeResId", -1), this.f124358c);
            getSupportFragmentManager().beginTransaction().add((int) C0126R.C0129id.fragment_holder, this.f124357b).commit();
        }
        intent.getByteArrayExtra("logToken");
        new bjes(1746, null);
        if ("user".equals(Build.TYPE) && (window = getWindow()) != null) {
            window.addFlags(8192);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }
}

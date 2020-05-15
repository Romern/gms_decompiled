package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class acup extends AsyncTask {

    /* renamed from: a */
    private final String f60824a;

    public acup(String str) {
        this.f60824a = str;
    }

    /* renamed from: a */
    public final acuo doInBackground(String... strArr) {
        boolean z;
        if (strArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        String str = strArr[0];
        String str2 = strArr[1];
        aucb b = brhk.m114021a(mo33110a()).f142855a.mo24732b(new brip(new GetIndexableRequest(str, str2)));
        acuo acuo = new acuo();
        try {
            acuo.f60822a = (brhy) aucu.m76783a(b, 60, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            acuo.f60823b = e;
        }
        return acuo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo33110a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract View mo33111b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo33112c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract TextView mo33113d();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acua.a(android.view.View, java.lang.String):void
     arg types: [android.widget.TextView, java.lang.String]
     candidates:
      acua.a(android.view.View, com.google.firebase.appindexing.internal.ActionImpl):void
      acua.a(android.view.View, com.google.firebase.appindexing.internal.Thing):void
      acua.a(android.widget.TextView, java.lang.String):void
      acua.a(java.lang.StringBuilder, int):void
      acua.a(android.view.View, java.lang.String):void */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        acuo acuo = (acuo) obj;
        mo33111b().setVisibility(0);
        mo33112c().setVisibility(8);
        if (acuo.f60823b == null) {
            brhy brhy = acuo.f60822a;
            if (brhy == null) {
                acua.m49857a((View) mo33113d(), this.f60824a);
            } else if (brhy instanceof Thing) {
                acua.m49856a(mo33113d(), (Thing) acuo.f60822a);
            } else {
                acua.m49857a((View) mo33113d(), mo33110a().getString(C0126R.string.invalid_indexable_type, "Indexable"));
            }
        } else {
            new AlertDialog.Builder(mo33110a()).setTitle(mo33110a().getString(C0126R.string.indexable_details_title, "Indexable")).setMessage(mo33110a().getString(C0126R.string.failed_retrieve_indexable_details, "Indexable")).setPositiveButton((int) C0126R.string.common_ok, (DialogInterface.OnClickListener) null).show();
            acua.m49857a((View) mo33113d(), mo33110a().getString(C0126R.string.failed_retrieve_indexable_details, "Indexable"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        mo33111b().setVisibility(8);
        mo33112c().setVisibility(0);
    }
}

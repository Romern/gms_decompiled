package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: rli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rli implements Runnable {

    /* renamed from: a */
    final /* synthetic */ rlj f43225a;

    /* renamed from: b */
    private final rlg f43226b;

    public rli(rlj rlj, rlg rlg) {
        this.f43225a = rlj;
        this.f43226b = rlg;
    }

    public final void run() {
        if (this.f43225a.f43228b) {
            ConnectionResult connectionResult = this.f43226b.f43222b;
            if (connectionResult.mo17670a()) {
                rlj rlj = this.f43225a;
                rlj.f30135e.startActivityForResult(GoogleApiActivity.m22484a(rlj.mo17729f(), connectionResult.f30066d, this.f43226b.f43221a, false), 1);
            } else if (rfy.m33547b(connectionResult.f30065c)) {
                rlj rlj2 = this.f43225a;
                rfi rfi = rlj2.f43230d;
                Activity f = rlj2.mo17729f();
                rlj rlj3 = this.f43225a;
                rnx rnx = rlj3.f30135e;
                int i = connectionResult.f30065c;
                Dialog a = rfi.mo24581a(f, i, new say(rfi.mo24591b(f, i, "d"), rnx), rlj3);
                if (a != null) {
                    rfi.mo24584a(f, a, "GooglePlayServicesErrorDialog", rlj3);
                }
            } else if (connectionResult.f30065c != 18) {
                this.f43225a.mo24843a(connectionResult, this.f43226b.f43221a);
            } else {
                rlj rlj4 = this.f43225a;
                rfi rfi2 = rlj4.f43230d;
                Activity f2 = rlj4.mo17729f();
                rlj rlj5 = this.f43225a;
                ProgressBar progressBar = new ProgressBar(f2, null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(f2);
                builder.setView(progressBar);
                builder.setMessage(sau.m34809c(f2, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                rfi2.mo24584a(f2, create, "GooglePlayServicesUpdatingDialog", rlj5);
                rlj rlj6 = this.f43225a;
                rlj6.f43230d.mo24583a(rlj6.mo17729f().getApplicationContext(), new rlh(this, create));
            }
        }
    }
}

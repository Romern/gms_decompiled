package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Locale;

/* renamed from: jhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhe extends DialogFragment implements LoaderManager.LoaderCallbacks {

    /* renamed from: b */
    private static final sek f22479b = ght.m13171a("AuthManaged", "ProgressDialogFragment");

    /* renamed from: a */
    protected ProgressDialog f22480a;

    /* renamed from: c */
    private jhl f22481c;

    /* renamed from: d */
    private byte[] f22482d;

    /* renamed from: e */
    private camd f22483e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13732a(int i) {
        if (((jhd) getActivity()) != null) {
            ((jhd) getActivity()).mo7757b(i);
        }
        dismissAllowingStateLoss();
    }

    /* renamed from: b */
    public final void mo13733b(int i) {
        ProgressDialog progressDialog = this.f22480a;
        if (progressDialog != null) {
            progressDialog.setMessage(getArguments().getCharSequence("message"));
            this.f22480a.setProgress(i);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f22481c = jhl.m16704a();
        byte[] byteArray = getArguments().getByteArray("packageInformationBytes");
        this.f22482d = byteArray;
        camd a = this.f22481c.mo13738a(byteArray);
        this.f22483e = a;
        if (a == null) {
            mo13732a(1);
        }
        if (ccgz.m129649c()) {
            jhm.m16712a(getActivity()).mo13744a(10, this.f22483e);
        }
        getLoaderManager().initLoader(1, null, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 4) {
            return;
        }
        if (i2 == -1) {
            if (ccgz.m129649c()) {
                jhm.m16712a(getActivity()).mo13744a(13, this.f22483e);
            }
            mo13732a(2);
            return;
        }
        mo13732a(1);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo13732a(0);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.f22480a = progressDialog;
        progressDialog.setTitle(getArguments().getCharSequence("title"));
        this.f22480a.setMessage(getArguments().getCharSequence("message"));
        this.f22480a.setProgressStyle(1);
        this.f22480a.setCancelable(true);
        this.f22480a.setCanceledOnTouchOutside(false);
        this.f22480a.setProgressNumberFormat(null);
        this.f22480a.setButton(-2, getText(C0126R.string.common_cancel), new jhc(this));
        return this.f22480a;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1) {
            return new jgu(getActivity(), getArguments().getLong("downloadRequestId"));
        }
        if (i == 2) {
            return new jgw(getActivity(), getArguments().getLong("downloadRequestId"), this.f22483e);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Integer num = (Integer) obj;
        int id = loader.getId();
        if (id == 1) {
            f22479b.mo25412b(String.format(Locale.US, "onAppDownloadLoaderFinished with progress: %d", num), new Object[0]);
            if (num.intValue() == 101) {
                mo13733b(98);
                if (ccgz.m129649c()) {
                    jhm.m16712a(getActivity()).mo13744a(11, this.f22483e);
                }
                if (ccgz.m129649c()) {
                    jhm.m16712a(getActivity()).mo13744a(12, this.f22483e);
                }
                int i = Build.VERSION.SDK_INT;
                getLoaderManager().initLoader(2, null, this);
            } else if (num.intValue() == -2) {
                mo13732a(1);
            } else if (num.intValue() == -1) {
                ProgressDialog progressDialog = this.f22480a;
                if (progressDialog != null) {
                    progressDialog.setMessage(getArguments().getCharSequence("pausedMessage"));
                }
            } else {
                mo13733b((num.intValue() * 98) / 100);
            }
        } else if (id != 2) {
        } else {
            if (num.intValue() == 101) {
                if (ccgz.m129649c()) {
                    jhm.m16712a(getActivity()).mo13744a(13, this.f22483e);
                }
                mo13732a(2);
            } else if (num.intValue() == -1) {
                mo13732a(1);
            } else if (num.intValue() == -2) {
                mo13732a(3);
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}

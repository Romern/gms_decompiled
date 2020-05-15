package p000;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aafw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafw extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private String f28046a;

    /* renamed from: b */
    private String f28047b;

    /* renamed from: a */
    private static final int m21186a(Context context, String str) {
        try {
            return svr.m36484b(context).mo26176b(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(str);
            Log.w("V1UpgradeDialogFragment", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            return -1;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (activity != null) {
            if (i == -1) {
                Intent b = sbv.m34879b("com.google.android.play.games");
                b.setData(b.getData().buildUpon().appendQueryParameter("pcampaignid", "GPG_playGamesUpsell").build());
                try {
                    activity.startActivity(b);
                } catch (ActivityNotFoundException e) {
                    aaeg.m21158b("V1UpgradeDialogFragment", "Unable to launch play store intent", e);
                }
            }
            activity.finish();
            if (i == -1) {
                m21187a(37);
            } else if (i == -2) {
                m21187a(36);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        this.f28046a = getArguments().getString("game_package_name");
        this.f28047b = getArguments().getString("game_id");
        m21187a(35);
        if (!soz.m35807f(getActivity())) {
            i = C0126R.string.games_required_dialog_message;
        } else {
            i = C0126R.string.games_required_dialog_message_restricted;
        }
        C1349sg sgVar = new C1349sg(getActivity(), 2132017760);
        sgVar.mo15891a((int) C0126R.C0127drawable.games_dialog_ic);
        sgVar.mo15905b((int) C0126R.string.games_required_dialog_title);
        sgVar.mo15912d(i);
        sgVar.mo15906b((int) C0126R.string.games_required_dialog_go_to_play_store, this);
        sgVar.mo15892a((int) C0126R.string.common_cancel, this);
        return sgVar.mo15904b();
    }

    /* renamed from: a */
    private final void m21187a(int i) {
        bxvd da = aafk.f28015f.mo74144da();
        Context context = getContext();
        String str = this.f28046a;
        String str2 = this.f28047b;
        bxvd da2 = aafn.f28027i.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aafn aafn = (aafn) da2.f164949b;
        aafn.f28029a |= 1;
        aafn.f28030b = false;
        String valueOf = String.valueOf(rfi.f42869b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aafn aafn2 = (aafn) da2.f164949b;
        valueOf.getClass();
        aafn2.f28029a |= 16;
        aafn2.f28033e = valueOf;
        long a = (long) m21186a(context, "com.google.android.play.games");
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aafn aafn3 = (aafn) da2.f164949b;
        int i2 = aafn3.f28029a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aafn3.f28029a = i2;
        aafn3.f28036h = a;
        if (str2 != null) {
            str2.getClass();
            i2 |= 2;
            aafn3.f28029a = i2;
            aafn3.f28031c = str2;
        }
        if (str != null) {
            str.getClass();
            aafn3.f28029a = i2 | 8;
            aafn3.f28032d = str;
        }
        int a2 = m21186a(context, str);
        if (a2 > 0) {
            long j = (long) a2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aafn aafn4 = (aafn) da2.f164949b;
            aafn4.f28029a |= 32;
            aafn4.f28034f = j;
        }
        aafn aafn5 = (aafn) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aafk aafk = (aafk) da.f164949b;
        aafn5.getClass();
        aafk.f28018b = aafn5;
        aafk.f28017a |= 1;
        bxvd da3 = aafm.f28023c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        aafm aafm = (aafm) da3.f164949b;
        aafm.f28026b = i - 1;
        aafm.f28025a |= 1;
        aafm aafm2 = (aafm) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aafk aafk2 = (aafk) da.f164949b;
        aafm2.getClass();
        aafk2.f28019c = aafm2;
        aafk2.f28017a |= 4;
        aafk aafk3 = (aafk) da.mo74062i();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new qws(getContext(), "GAMES", null).mo24335a(aafk3.serializeToBytes()).mo24327b();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}

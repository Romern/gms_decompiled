package com.google.android.gms.games.entrypoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpgradeModuleEntryPointChimeraActivity extends deu implements cays {

    /* renamed from: b */
    private static final srn f32604b = srn.m36126a("UpgradeModuleActivity", sgj.GAMES);

    /* renamed from: c */
    private aadp f32605c;

    /* renamed from: e */
    public final cayp mo19363e() {
        return new cayr(bnhe.m109408a(aaea.class, this.f32605c.f27979a), bnoj.f131912b);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        aadp aadp = this.f32605c;
        if (aadp != null) {
            for (aafg aafg : ((aafi) aadp.f27980b.mo6445a()).f28013a.f28012a) {
                aafg.mo16825a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean a = ceau.f182188a.mo6606a().mo78704a();
        if (a) {
            if (aadq.f27984a.get() != null) {
                aadx aadx = (aadx) aadq.f27984a.get();
            } else {
                aadw aadw = new aadw();
                rpr b = rpr.m34216b();
                cazf.m127594a(b);
                aadw.f27988a = b;
                cazf.m127595a(aadw.f27988a, Context.class);
                aadq.f27984a.compareAndSet(null, new aadx());
                aadx aadx2 = (aadx) aadq.f27984a.get();
            }
            aadt aadt = new aadt();
            cazf.m127594a(this);
            aadt.f27987a = this;
            cazf.m127595a(aadt.f27987a, dnx.class);
            aadp aadp = new aadp(aadt.f27987a);
            this.f32605c = aadp;
            aadp.mo16773a().mo2255a(bundle);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
        if (stringExtra == null) {
            stringExtra = getPackageName();
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (!a) {
            bnsl bnsl = (bnsl) f32604b.mo68390d();
            bnsl.mo68432a("com.google.android.gms.games.entrypoint.UpgradeModuleEntryPointChimeraActivity", "onCreate", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Seamless install disabled, launching legacy install dialog flow");
            Bundle bundle2 = new Bundle();
            bundle2.putString("game_package_name", stringExtra);
            bundle2.putString("game_id", stringExtra2);
            aafw aafw = new aafw();
            aafw.setCancelable(false);
            aafw.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("play_games_upgrade");
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            beginTransaction.add(aafw, "play_games_upgrade");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        Bundle bundle3 = new Bundle();
        aaea aaea = new aaea();
        aaea.setArguments(bundle3);
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
        Fragment findFragmentByTag2 = supportFragmentManager2.findFragmentByTag("play_games_upgrade");
        if (findFragmentByTag2 != null) {
            beginTransaction2.remove(findFragmentByTag2);
        }
        beginTransaction2.add(aaea, "play_games_upgrade");
        beginTransaction2.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        aadp aadp = this.f32605c;
        if (aadp != null) {
            aadp.mo16773a().mo2256b(bundle);
        }
        super.onSaveInstanceState(bundle);
    }
}

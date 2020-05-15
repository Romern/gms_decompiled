package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;

/* renamed from: wjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjo implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50771a;

    public wjo(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50771a = familyCreationChimeraActivity;
    }

    /* renamed from: a */
    private final void m41976a() {
        wgm.m41916a(this.f50771a, new wjm(this), new wjn(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50771a;
        return new wmn(familyCreationChimeraActivity, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c, familyCreationChimeraActivity.f31368e, familyCreationChimeraActivity.f31367d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        boolean z;
        FamilyCreationChimeraActivity familyCreationChimeraActivity;
        brda brda;
        brcm brcm;
        why why = (why) obj;
        if (!why.f50696b) {
            this.f50771a.f31382s.mo29110a(3, 17);
            m41976a();
            return;
        }
        if (this.f50771a.f31374k) {
            bxwc bxwc = ((brda) why.f50695a).f142463c;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                bree bree = (bree) bxwc.get(i);
                int a = bred.m113924a(bree.f142592a);
                if (a == 0 || a != 17) {
                    int a2 = bred.m113924a(bree.f142592a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    i++;
                    if (a2 == 23) {
                    }
                }
                PageData pageData = new PageData(bree);
                Fragment findFragmentById = this.f50771a.getSupportFragmentManager().findFragmentById(C0126R.C0129id.fm_family_creation_fragment_container);
                if (findFragmentById instanceof wis) {
                    ((wis) findFragmentById).mo29132a(pageData);
                }
                FamilyCreationChimeraActivity familyCreationChimeraActivity2 = this.f50771a;
                familyCreationChimeraActivity2.f31374k = false;
                familyCreationChimeraActivity2.mo18453j();
                return;
            }
        }
        brda brda2 = (brda) why.f50695a;
        if ((brda2.f142461a & 8) != 0) {
            brao brao = brda2.f142465e;
            if (brao == null) {
                brao = brao.f142163b;
            }
            int a3 = bran.m113824a(brao.f142165a);
            if (a3 != 0 && a3 == 3) {
                wgm.m41919b(this.f50771a, new wjl(this)).show();
                return;
            }
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity3 = this.f50771a;
        brda brda3 = (brda) why.f50695a;
        if ((brda3.f142461a & 2) != 0) {
            brcz brcz = brda3.f142464d;
            if (brcz == null) {
                brcz = brcz.f142453c;
            }
            if (brcz.f142455a) {
                z = true;
                familyCreationChimeraActivity3.f31373j = z;
                familyCreationChimeraActivity = this.f50771a;
                if (familyCreationChimeraActivity.f31373j) {
                    brcz brcz2 = ((brda) why.f50695a).f142464d;
                    if (brcz2 == null) {
                        brcz2 = brcz.f142453c;
                    }
                    int a4 = brck.m113873a(brcz2.f142456b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    familyCreationChimeraActivity.f31384u = a4;
                }
                FamilyCreationChimeraActivity familyCreationChimeraActivity4 = this.f50771a;
                brda = (brda) why.f50695a;
                familyCreationChimeraActivity4.f31375l = brda.f142466f;
                if (brda.f142467g.size() <= 0) {
                    brcm = (brcm) brda.f142458h.mo14948a(Integer.valueOf(((brda) why.f50695a).f142467g.mo74151b(0)));
                } else {
                    brcm = brcm.MEMBER;
                }
                familyCreationChimeraActivity4.f31369f = brcm;
                if (((brda) why.f50695a).f142463c.size() <= 0) {
                    this.f50771a.f31376m = new PageDataMap();
                    bxwc bxwc2 = ((brda) why.f50695a).f142463c;
                    int size2 = bxwc2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bree bree2 = (bree) bxwc2.get(i2);
                        PageDataMap pageDataMap = this.f50771a.f31376m;
                        int a5 = bred.m113924a(bree2.f142592a);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        pageDataMap.mo18559a(a5 - 1, new PageData(bree2));
                    }
                    this.f50771a.mo18437a(6);
                    this.f50771a.mo18469z();
                    return;
                }
                this.f50771a.f31382s.mo29110a(3, 28);
                m41976a();
                return;
            }
        }
        z = false;
        familyCreationChimeraActivity3.f31373j = z;
        familyCreationChimeraActivity = this.f50771a;
        if (familyCreationChimeraActivity.f31373j) {
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity42 = this.f50771a;
        brda = (brda) why.f50695a;
        familyCreationChimeraActivity42.f31375l = brda.f142466f;
        if (brda.f142467g.size() <= 0) {
        }
        familyCreationChimeraActivity42.f31369f = brcm;
        if (((brda) why.f50695a).f142463c.size() <= 0) {
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}

package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: rkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rkj {

    /* renamed from: a */
    public rkk f43190a;

    public rkj() {
    }

    /* renamed from: d */
    public final tir mo24810d() {
        return ((tjm) this.f43190a).mo26586b();
    }

    /* renamed from: e */
    public final List mo24811e() {
        return ((AliasedPlacesResult) this.f43190a).f79581b;
    }

    /* renamed from: f */
    public final String mo24812f() {
        return ((aezj) this.f43190a).mo34653b();
    }

    /* renamed from: g */
    public final List mo24813g() {
        HarmfulAppsInfo harmfulAppsInfo = ((apgm) this.f43190a).f84339a;
        return harmfulAppsInfo != null ? Arrays.asList(harmfulAppsInfo.f107319b) : Collections.emptyList();
    }

    /* renamed from: h */
    public final boolean mo24814h() {
        apgn apgn = (apgn) this.f43190a;
        Status status = apgn.f84341a;
        if (status == null || !status.mo17710c()) {
            return false;
        }
        return apgn.f84342b;
    }

    /* renamed from: i */
    public final CorpusConfigParcelable[] mo24815i() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.f43190a).f107364b;
    }

    /* renamed from: j */
    public final long mo24816j() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.f43190a).f107365c;
    }

    /* renamed from: k */
    public final AppIndexingErrorInfo[] mo24817k() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.f43190a).f107366d;
    }

    /* renamed from: l */
    public final AppIndexingUserActionInfo[] mo24818l() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.f43190a).f107367e;
    }

    /* renamed from: m */
    public final GetStorageStatsCall$PackageStats[] mo24819m() {
        return ((GetStorageStatsCall$Response) this.f43190a).f107378b;
    }

    /* renamed from: n */
    public final long mo24820n() {
        return ((GetStorageStatsCall$Response) this.f43190a).f107380d;
    }

    /* renamed from: o */
    public final long mo24821o() {
        return ((GetStorageStatsCall$Response) this.f43190a).f107381e;
    }

    /* renamed from: p */
    public final boolean mo24822p() {
        return ((avdh) this.f43190a).mo51101a();
    }

    /* renamed from: q */
    public final boolean mo24823q() {
        return ((avdh) this.f43190a).mo51102b();
    }

    /* renamed from: r */
    public final boolean mo24824r() {
        return ((avuw) this.f43190a).mo51635b();
    }

    /* renamed from: s */
    public final Status mo24825s() {
        return ((awjz) this.f43190a).f94579a;
    }

    public rkj(rkk rkk) {
        this.f43190a = rkk;
    }
}

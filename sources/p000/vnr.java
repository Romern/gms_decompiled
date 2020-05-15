package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.p039ui.select.path.TopLevelView$MyDrivePathElement;
import com.google.android.gms.drive.p039ui.select.path.ViewPathElement;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;

/* renamed from: vnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnr {

    /* renamed from: a */
    public static final TopLevelView$MyDrivePathElement f49586a = new TopLevelView$MyDrivePathElement();

    /* renamed from: b */
    public static final ViewPathElement f49587b = new ViewPathElement(C0126R.string.drive_view_shared_with_me, C0126R.C0127drawable.quantum_ic_supervisor_account_grey600_24, new FieldOnlyFilter(vgc.f49224h), voc.f49621b);

    /* renamed from: c */
    public static final ViewPathElement f49588c;

    /* renamed from: d */
    public static final ViewPathElement[] f49589d;

    /* renamed from: e */
    private static final ViewPathElement f49590e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter
     arg types: [uwb, boolean]
     candidates:
      vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter
      vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter */
    static {
        FieldOnlyFilter fieldOnlyFilter = new FieldOnlyFilter(vgc.f49226j);
        Filter[] filterArr = {vfu.m40350a(vfu.m40352a(vgc.f49218b, "application/vnd.google-apps.folder"))};
        sdo.checkIfNull(fieldOnlyFilter, "Filter may not be null.");
        sdo.checkIfNull(filterArr, "Additional filters may not be null.");
        f49590e = new ViewPathElement(C0126R.string.drive_view_recent, C0126R.C0127drawable.quantum_ic_schedule_grey600_24, new LogicalFilter(Operator.f31127f, fieldOnlyFilter, filterArr), voc.f49622c);
        ViewPathElement viewPathElement = new ViewPathElement(C0126R.string.drive_filestate_starred, C0126R.C0127drawable.quantum_ic_grade_grey600_24, vfu.m40352a(vgc.f49221e, (Object) true), voc.f49623d);
        f49588c = viewPathElement;
        f49589d = new ViewPathElement[]{f49586a, f49587b, f49590e, viewPathElement};
    }
}

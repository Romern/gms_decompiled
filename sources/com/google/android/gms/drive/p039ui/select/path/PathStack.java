package com.google.android.gms.drive.p039ui.select.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.drive.ui.select.path.PathStack */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PathStack implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vnl();

    /* renamed from: a */
    public static final sbw f31209a = new sbw("PathStack", "");

    /* renamed from: b */
    public static final PathElement f31210b = RootPathElement.f31214a;

    /* renamed from: c */
    public List f31211c;

    /* renamed from: d */
    public DriveId f31212d;

    /* renamed from: e */
    private Set f31213e;

    public PathStack() {
        this(m23106a(vnr.f49586a));
    }

    /* renamed from: a */
    public static ArrayList m23106a(PathElement pathElement) {
        return new ArrayList(bngx.m109356a(pathElement));
    }

    /* renamed from: b */
    public final PathElement mo18351b() {
        if (this.f31211c.isEmpty()) {
            return null;
        }
        List list = this.f31211c;
        return (PathElement) list.get(list.size() - 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f31211c.isEmpty() ^ true ? (byte) 1 : 0);
        if (this.f31211c.isEmpty()) {
            parcel.writeParcelable(this.f31212d, i);
        } else {
            parcel.writeList(this.f31211c);
        }
    }

    public PathStack(DriveId driveId) {
        this(new ArrayList());
        this.f31212d = driveId;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo18346a() {
        sdo.m34971a(!this.f31211c.isEmpty(), (Object) "Not initialized yet");
        for (vnn vnn : this.f31213e) {
            vnn.mo28628a(mo18351b());
        }
    }

    public PathStack(ArrayList arrayList) {
        this.f31211c = arrayList;
        this.f31213e = new HashSet();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo18347a(SearchPathElement searchPathElement) {
        sdo.m34971a(!this.f31211c.isEmpty(), (Object) "Not initialized yet");
        this.f31211c.add(searchPathElement);
        mo18346a();
    }

    /* renamed from: b */
    public final void mo18352b(vnn vnn) {
        this.f31213e.remove(vnn);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo18348a(rkb rkb) {
        boolean z;
        sdo.m34971a(!this.f31211c.isEmpty(), (Object) "Not initialized yet");
        if (mo18351b() != f31210b) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Can't pop the root path element");
        if (this.f31211c.size() > 1) {
            List list = this.f31211c;
            list.remove(list.size() - 1);
            mo18346a();
        } else if (this.f31211c.get(0) instanceof FolderPathElement) {
            FolderPathElement folderPathElement = (FolderPathElement) this.f31211c.get(0);
            rkb.mo24787a((rle) new uss(folderPathElement.f31204a.mo18114c(), rkb)).mo9458a((rkl) new vnm(this, twn.f46759e.mo26842a(rkb).f48623a, folderPathElement.f31206c, folderPathElement.f31205b));
        } else {
            this.f31211c.set(0, f31210b);
            mo18346a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo18349a(twz twz) {
        boolean z = true;
        sdo.m34971a(!this.f31211c.isEmpty(), (Object) "Not initialized yet");
        if (mo18351b() == f31210b) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Can't push a folder on top of the root path element");
        this.f31211c.add(new FolderPathElement(twz));
        mo18346a();
    }

    /* renamed from: a */
    public final void mo18350a(vnn vnn) {
        this.f31213e.add(vnn);
        if (!this.f31211c.isEmpty()) {
            vnn.mo28628a(mo18351b());
        }
    }
}

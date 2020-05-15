package p000;

import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alnl extends alnj {

    /* renamed from: b */
    final /* synthetic */ alnn f73852b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alnl(alnn alnn) {
        super(alnn);
        this.f73852b = alnn;
    }

    /* renamed from: a */
    public final void mo40610a(Bundle bundle, alto alto, String str) {
        Bundle bundle2 = new Bundle();
        Cursor a = alto.mo40744a("SELECT O.ordinal, P.gaia_id, P.name, P.name_verified, P.tagline, P.avatar, P.profile_type FROM people AS P JOIN temp_gaia_ordinal AS O ON O.qualified_id = P.qualified_id WHERE P.blocked = 0 AND P.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a2 = alto.mo40744a("SELECT O.ordinal, E.email, E.type FROM emails AS E JOIN temp_gaia_ordinal AS O ON O.qualified_id = E.qualified_id WHERE E.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a3 = alto.mo40744a("SELECT O.ordinal, P.phone, P.type FROM phones AS P JOIN temp_gaia_ordinal AS O ON O.qualified_id = P.qualified_id WHERE P.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a4 = alto.mo40744a("SELECT O.ordinal, A.postal_address, A.type FROM postal_address AS A JOIN temp_gaia_ordinal AS O ON O.qualified_id = A.qualified_id WHERE A.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle3 = new Bundle();
        alnn alnn = this.f73852b;
        DataHolder dataHolder = new DataHolder(a, null);
        alnn.mo41260a(dataHolder);
        bundle3.putParcelable("people", dataHolder);
        alnn alnn2 = this.f73852b;
        DataHolder dataHolder2 = new DataHolder(a2, null);
        alnn2.mo41260a(dataHolder2);
        bundle3.putParcelable("people_email", dataHolder2);
        alnn alnn3 = this.f73852b;
        DataHolder dataHolder3 = new DataHolder(a3, null);
        alnn3.mo41260a(dataHolder3);
        bundle3.putParcelable("people_phone", dataHolder3);
        alnn alnn4 = this.f73852b;
        DataHolder dataHolder4 = new DataHolder(a4, null);
        alnn4.mo41260a(dataHolder4);
        bundle3.putParcelable("people_address", dataHolder4);
        bundle2.putAll(bundle3);
        Cursor a5 = alto.mo40744a("SELECT O.ordinal, C.circle_id, C.name, C.people_count FROM circle_members AS CM JOIN temp_gaia_ordinal AS O ON O.qualified_id = CM.qualified_id JOIN circles AS C ON C.circle_id = CM.circle_id AND C.owner_id = CM.owner_id WHERE C.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle4 = new Bundle();
        alnn alnn5 = this.f73852b;
        DataHolder dataHolder5 = new DataHolder(a5, null);
        alnn5.mo41260a(dataHolder5);
        bundle4.putParcelable("circles", dataHolder5);
        bundle2.putAll(bundle4);
        Cursor a6 = alto.mo40744a("SELECT O.ordinal, U.gaia_id, U.display_name, U.avatar FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.gaia_id = U.gaia_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a7 = alto.mo40744a("SELECT O.ordinal, E.email, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_emails AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a8 = alto.mo40744a("SELECT O.ordinal, E.phone, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_phones AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a9 = alto.mo40744a("SELECT O.ordinal, E.postal_address, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_postal_address AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle5 = new Bundle();
        alnn alnn6 = this.f73852b;
        DataHolder dataHolder6 = new DataHolder(a6, null);
        alnn6.mo41260a(dataHolder6);
        bundle5.putParcelable("owner", dataHolder6);
        alnn alnn7 = this.f73852b;
        DataHolder dataHolder7 = new DataHolder(a7, null);
        alnn7.mo41260a(dataHolder7);
        bundle5.putParcelable("owner_email", dataHolder7);
        alnn alnn8 = this.f73852b;
        DataHolder dataHolder8 = new DataHolder(a8, null);
        alnn8.mo41260a(dataHolder8);
        bundle5.putParcelable("owner_phone", dataHolder8);
        alnn alnn9 = this.f73852b;
        DataHolder dataHolder9 = new DataHolder(a9, null);
        alnn9.mo41260a(dataHolder9);
        bundle5.putParcelable("owner_address", dataHolder9);
        bundle2.putAll(bundle5);
        bundle.putBundle("db", bundle2);
    }
}

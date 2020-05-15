package p000;

import android.database.Cursor;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alnk extends alnj {

    /* renamed from: b */
    final /* synthetic */ alnn f73851b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alnk(alnn alnn) {
        super(alnn);
        this.f73851b = alnn;
    }

    /* renamed from: a */
    public final void mo40610a(Bundle bundle, alto alto, String str) {
        StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        sb.append("SELECT DISTINCT M.gaia_id, M.contact_id FROM gaia_id_map AS M JOIN temp_gaia_ordinal AS O ON O.gaia_id = M.gaia_id WHERE M.owner_id = ? ORDER BY O.ordinal");
        Cursor a = alto.mo40744a(sb.toString(), new String[]{str});
        alnn alnn = this.f73851b;
        DataHolder dataHolder = new DataHolder(a, null);
        alnn.mo41260a(dataHolder);
        bundle.putParcelable("gaia_map", dataHolder);
    }
}

package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;

/* renamed from: aosn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aosn implements aosj {

    /* renamed from: a */
    private final Context f83516a;

    /* renamed from: b */
    private final DataHolder f83517b;

    /* renamed from: c */
    private final Task f83518c;

    public aosn(Context context, DataHolder dataHolder, Task task) {
        this.f83516a = context;
        this.f83517b = dataHolder;
        this.f83518c = task;
    }

    /* renamed from: a */
    public final void mo46826a(aosu aosu, String str) {
        if (!srq.m36141b(sqr.m35996a(this.f83516a, str))) {
            new Object[1][0] = str;
            TaskEntity taskEntity = new TaskEntity(this.f83518c);
            Parcel bj = aosu.mo8529bj();
            dcl.m8165a(bj, taskEntity);
            aosu.mo8528b(1, bj);
            return;
        }
        new Object[1][0] = str;
        DataHolder dataHolder = this.f83517b;
        Parcel bj2 = aosu.mo8529bj();
        dcl.m8165a(bj2, dataHolder);
        aosu.mo8528b(3, bj2);
    }
}

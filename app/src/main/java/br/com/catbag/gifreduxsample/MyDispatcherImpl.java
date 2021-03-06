package br.com.catbag.gifreduxsample;

import com.umaplay.fluxxan.impl.DispatcherImpl;

import br.com.catbag.gifreduxsample.models.AppState;
import trikita.anvil.Anvil;

/**
 * Created by raulcca on 11/21/16.
 */

public class MyDispatcherImpl extends DispatcherImpl<AppState> {
    /**
     * Your initial state tree
     *
     * @param state
     */
    public MyDispatcherImpl(AppState state) {
        super(state);
    }

    @Override
    protected void notifyStateListeners(AppState newState, AppState oldState) {
        super.notifyStateListeners(newState, oldState);
        Anvil.render();
    }
}

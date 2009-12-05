/* ******************************************************************************
 * Copyright (c) 2006-2009 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.internal.mindmap;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.xmind.gef.IViewer;
import org.xmind.gef.ui.editor.IGraphicalEditorPage;
import org.xmind.ui.internal.TopicContextService;

/**
 * @author Karelun Huang
 * 
 */
public class MindMapTopicContextService extends TopicContextService {

    private IGraphicalEditorPage page;

    /**
     * @param viewer
     */
    public MindMapTopicContextService(IGraphicalEditorPage page, IViewer viewer) {
        super(viewer);
        this.page = page;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.xmind.ui.internal.TopicContextService#getAdapter(java.lang.Class)
     */
    @Override
    public Object getAdapter(Class adapter) {
        if (adapter == ISelectionProvider.class) {
            return page.getParentEditor().getSite().getSelectionProvider();
        }
        return null;
    }

}